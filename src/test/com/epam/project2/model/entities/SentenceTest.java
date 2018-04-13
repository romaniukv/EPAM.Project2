package test.com.epam.project2.model.entities;

import com.epam.project2.model.entities.Sentence;
import com.epam.project2.model.entities.Word;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SentenceTest {

    private String testSentence;
    private List<Word> expectedWords;

    @Before
    public void setUp() {
        testSentence = "There’s no use trying, she said: one can’t believe impossible things";
        expectedWords = new ArrayList<>();
        expectedWords.add(new Word("There’s"));
        expectedWords.add(new Word("no"));
        expectedWords.add(new Word("use"));
        expectedWords.add(new Word("trying"));
        expectedWords.add(new Word("she"));
        expectedWords.add(new Word("said"));
        expectedWords.add(new Word("one"));
        expectedWords.add(new Word("can’t"));
        expectedWords.add(new Word("believe"));
        expectedWords.add(new Word("impossible"));
        expectedWords.add(new Word("things"));
    }

    @Test
    public void splitIntoWords() {
        Sentence sentence = new Sentence();
        List<Word> actualWords = sentence.splitIntoWords(testSentence);
        assertEquals(expectedWords, actualWords);
    }
}