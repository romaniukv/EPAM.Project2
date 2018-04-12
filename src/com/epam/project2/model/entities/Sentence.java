package com.epam.project2.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private List<Word> words;

    public Sentence(String sentence) {
        this.words = splitIntoWords(sentence);
    }

    public List<Word> splitIntoWords(String sentence) {
        List<Word> resultWords = new ArrayList<>();
        String[] stringWords = sentence.split(PunctuationMark.SENTENCE_DELIMITERS);
        for (String word: stringWords) {
            resultWords.add(new Word(word));
        }
        return resultWords;
    }

    public List<Word> getWords() {
        return words;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Word word: words) {
            stringBuffer.append(word.makeWord());
            stringBuffer.append(" ");
        }
        return String.valueOf(stringBuffer);
    }
}
