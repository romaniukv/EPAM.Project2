package com.epam.project2.model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Word implements Comparable {

    private List<Letter> letters = new ArrayList<>();

    public Word(String word) {
        splitIntoLetters(word);
    }

    private void splitIntoLetters(String word) {
        char[] charLetters = word.toLowerCase().toCharArray();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(letters, word.letters);
    }
}
