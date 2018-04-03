package com.epam.project2.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private List<Word> words = new ArrayList<>();

    public Sentence(String sentence) {
        splitIntoWords(sentence);
    }

    private void splitIntoWords(String sentence) {
        String[] stringWords = sentence.split(PunctuationMark.SENTENCE_DELIMITERS);
        for (String word: stringWords) {
            words.add(new Word(word));
        }
    }

    public List<Word> getWords() {
        return words;
    }

    public String makeSentence() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Word word: words) {
            stringBuffer.append(word.makeWord());
            stringBuffer.append(" ");
        }
        return String.valueOf(stringBuffer);
    }

    @Override
    public String toString() {
        return makeSentence();
    }
}
