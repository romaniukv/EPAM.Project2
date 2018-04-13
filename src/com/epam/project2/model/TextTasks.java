package com.epam.project2.model;

import com.epam.project2.model.entities.Letter;
import com.epam.project2.model.entities.Sentence;
import com.epam.project2.model.entities.Text;
import com.epam.project2.model.entities.Word;

import java.util.*;

public class TextTasks {

    private Text text;
    private Letter letter;

    public TextTasks() {
    }

    public String sortByLetterCount() {
        List<Integer>  letterCount = countLetterOccurrences();
        List<Word> words = getAllWordsFromText();
        int max;
        for (int i = 0; i < words.size() - 1; i++) {
            max = i;
            for (int j = i + 1; j < words.size(); j++) {
                if (letterCount.get(max).compareTo(letterCount.get(j)) <= 0) {
                    max = j;
                }
            }
            if (letterCount.get(max).equals(letterCount.get(i))) {
                swapByAlphabet(words, i, max);
            } else {
                Collections.swap(letterCount, i, max);
                Collections.swap(words, i, max);
            }
        }
        return makeStringFromWordList(words);
    }

    private String makeStringFromWordList(List<Word> words) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Word word: words) {
            stringBuffer.append(word.makeWord());
            stringBuffer.append(" ");
        }
        return String.valueOf(stringBuffer);
    }

    private void swapByAlphabet(List<Word> words, int i, int j) {
        String word1 = words.get(i).makeWord();
        String word2 = words.get(j).makeWord();
        if (word1.compareTo(word2) > 0) {
            Collections.swap(words, j, i);
        }
    }

    private List<Integer> countLetterOccurrences() {
        List<Integer>  letterCount = new ArrayList<>();
        for (Word word: getAllWordsFromText()) {
            letterCount.add(countLetter(word));
        }
        return letterCount;
    }

    private int countLetter(Word word) {
        int n = 0;
        for (Letter l: word.getLetters()) {
            if (letter.equals(l))
                n++;
        }
        return n;
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
