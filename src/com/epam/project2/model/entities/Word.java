package com.epam.project2.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Word implements Comparable {

    private List<Letter> letters = new ArrayList<>();

    public Word(String word) {
        splitIntoLetters(word);
    }

    private void splitIntoLetters(String word) {
        char[] charLetters = word.toCharArray();
        for (char letter: charLetters) {
            letters.add(new Letter(letter));
        }

    }

    public List<Letter> getLetters() {
        return letters;
    }

    public String makeWord() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Letter letter: letters)
            stringBuffer.append(letter.getLetter());
        return String.valueOf(stringBuffer);
    }

    @Override
    public String toString() {
        return makeWord();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
