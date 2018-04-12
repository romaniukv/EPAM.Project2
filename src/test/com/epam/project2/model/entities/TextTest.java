package test.com.epam.project2.model.entities;


import com.epam.project2.model.entities.Sentence;
import com.epam.project2.model.entities.Text;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TextTest {

    private String testText;
    private List<Sentence> expectedSentences;

    @Before
    public void setUp() {
        testText = "Alice laughed. \"There’s no use trying,\" she said: \"one can’t believe impossible things\".\n" +
                "\"I daresay you haven’t had much practice,\" said the Queen. \"When I was your age, \n" +
                "I always did it for half-an-hour a day. Why\"?\n";
        expectedSentences = new ArrayList<>();
        expectedSentences.add(new Sentence("Alice laughed"));
        expectedSentences.add(new Sentence("\"There’s no use trying,\" she said: \"one can’t believe impossible things\""));
        expectedSentences.add(new Sentence("\"I daresay you haven’t had much practice,\" said the Queen"));
        expectedSentences.add(new Sentence("\"When I was your age, I always did it for half-an-hour a day"));
        expectedSentences.add(new Sentence("Why\""));
    }

    @Test
    public void splitIntoSentences() {
        Text text = new Text();
        List<Sentence> actualSentences = text.splitIntoSentences(testText);
        assertEquals(expectedSentences, actualSentences);
    }
}