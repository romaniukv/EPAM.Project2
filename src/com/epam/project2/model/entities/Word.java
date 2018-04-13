package com.epam.project2.model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Word {

    private List<Letter> letters;

    public Word(String word) {
        this.letters = splitIntoLetters(word);
    }

    private List<Letter> splitIntoLetters(String word) {
        List<Letter> resultLetters = new ArrayList<>();
        char[] charLetters = word.toLowerCase().toCharArray();
        for (char letter: charLetters) {
            resultLetters.add(new Letter(letter));
        }
        return resultLetters;
    }

    public List<Letter> getLetters() {
        return letters;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Letter letter: letters)
            stringBuffer.append(letter.getLetter());
        return String.valueOf(stringBuffer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(letters, word.letters);
    }
}
