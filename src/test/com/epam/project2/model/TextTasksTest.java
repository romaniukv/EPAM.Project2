package test.com.epam.project2.model;

import com.epam.project2.model.TextTasks;
import com.epam.project2.model.entities.Letter;
import com.epam.project2.model.entities.Text;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextTasksTest {

    private Text testText;
    private Letter letter;
    private String expectedResult;

    @Before
    public void setUp(){
        testText = new Text("How brave they’ll all think me at home! Why, I wouldn’t say anything about it, even if I fell off the top of the house (which was very likely true).");
        letter = new Letter('e');
        expectedResult = "even brave fell home house likely me the the they’ll true very about all anything at how i i if it of off say think top was which why wouldn’t";
    }

    @Test
    public void sortByLetterCount() {
        TextTasks textTasks = new TextTasks();
        textTasks.setText(testText);
        textTasks.setLetter(letter);
        String actualResult = textTasks.sortByLetterCount();
        assertEquals(expectedResult, actualResult);
    }
}