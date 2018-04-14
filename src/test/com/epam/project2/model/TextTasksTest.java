package test.com.epam.project2.model;

import com.epam.project2.model.TextTasks;
import com.epam.project2.model.entities.Letter;
import com.epam.project2.model.entities.Text;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextTasksTest {

    private Text testText;
    private Letter leter;
    private String expectedResult;

    @Before
    public void setUp(){
        testText = new Text("");
        leter = new Letter('a');
        expectedResult = "";
    }

    @Test
    public void sortByLetterCount() {
        TextTasks textTasks = new TextTasks();
        textTasks.setText(testText);
        textTasks.setLetter(leter);
        String actualResult = textTasks.sortByLetterCount();
        assertEquals(expectedResult, actualResult);
    }
}