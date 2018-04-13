package com.epam.project2.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private List<Sentence> sentences;

    public Text() {
    }

    public Text(String text) {
        this.sentences = splitIntoSentences(text);
    }

    public List<Sentence> splitIntoSentences(String txt) {
        String text = replaceMultipleSpaces(txt);
        List<Sentence> resultSentences = new ArrayList<>();
        String[] splitSentences = text.split(PunctuationMark.TEXT_DELIMITERS);
        for (String str: splitSentences) {
            resultSentences.add(new Sentence(str.trim()));
        }
        return resultSentences;
    }

    private String replaceMultipleSpaces(String text) {
        return text.replaceAll("\\s{2,}", " ").trim();
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Sentence sentence: sentences) {
            stringBuffer.append(sentence.toString());
            stringBuffer.append(". ");
        }
        return String.valueOf(stringBuffer);
    }
}
