package com.epam.project2.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private List<Sentence> sentences = new ArrayList<>();

    public Text() {

    }

    public Text(String text) {
        splitIntoSentences(text);
    }

    private void splitIntoSentences(String text) {
        String fixedText = fixText(text);
        sentences = new ArrayList<>();
        String[] splitSentences = fixedText.split(PunctuationMark.TEXT_DELIMITERS);
        for (String str: splitSentences) {
            sentences.add(new Sentence(str));
        }
    }

    private String fixText(String text) {
        return text.replaceAll("\\s{2,}", " ").trim();
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public String makeText() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Sentence sentence: sentences) {
            stringBuffer.append(sentence.makeSentence());
            stringBuffer.append(". ");
        }
        return String.valueOf(stringBuffer);
    }

    @Override
    public String toString() {
        return makeText();
    }
}
