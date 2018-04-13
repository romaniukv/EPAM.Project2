package com.epam.project2.model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {

    private List<Word> words;

    public Sentence() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(words, sentence.words);
    }
}
