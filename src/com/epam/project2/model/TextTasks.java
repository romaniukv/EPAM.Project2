package com.epam.project2.model;

import com.epam.project2.model.entities.Letter;
import com.epam.project2.model.entities.Sentence;
import com.epam.project2.model.entities.Text;
import com.epam.project2.model.entities.Word;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TextTasks {

    private Text text;
    private Letter letter;

    public TextTasks() {
    }

    public String sortByLetterCount() {
        List<Integer> letterCount = countLetterOccurrences();
        System.out.println(letterCount);
        List<Word> words = getAllWordsFromText();

        for (int i = letterCount.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (letterCount.get(j).compareTo(letterCount.get(j + 1)) < 0) {
                    Collections.swap(letterCount, j, j + 1);
                    Collections.swap(words, j, j + 1);
                }
                else if (letterCount.get(j).compareTo(letterCount.get(j + 1)) == 0) {
                    swapByAlphabet(words, j, j + 1);
                }
            }
        }

        return makeStringFromWordList(words);
    }

    private void swapByAlphabet(List<Word> words, int i, int j) {
        String word1 = words.get(i).toString();
        String word2 = words.get(j).toString();
        if (word1.compareToIgnoreCase(word2) > 0) {
            Collections.swap(words, j, i);
        }
    }

    private String makeStringFromWordList(List<Word> words) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Word word: words) {
            stringBuffer.append(word.toString());
            stringBuffer.append(" ");
        }
        return String.valueOf(stringBuffer.deleteCharAt(stringBuffer.length() - 1)); // Delete last space and return result
    }

    private List<Integer> countLetterOccurrences() {
        List<Integer>  letterCount = new ArrayList<>();
        for (Word word: getAllWordsFromText()) {
            int n = 0;
            for (Letter l: word.getLetters()) {
                if (letter.equals(l))
                    n++;
            }
            letterCount.add(n);
        }
        return letterCount;
    }

    private List<Word> getAllWordsFromText() {
        List<Word> allWords = new ArrayList<>();
        for (Sentence sentence: text.getSentences())
            allWords.addAll(sentence.getWords());
        return allWords;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public void setLetter(Letter letter) {
        this.letter = letter;
    }
}
