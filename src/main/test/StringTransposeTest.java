import main.java.StringTranspose;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    StringTranspose obj;
    @Before
    public void setUp()  {
        obj = new StringTranspose();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void testTransposeStringSuccess() {
        String actualStr = obj.transposeString("good morning");
        String expectedStr = "doog gninrom";
        assertEquals(expectedStr,actualStr);
    }

    @Test
    public void testCheckForGradeSuccess() {
        String actualStr = obj.transposeString("object oriented");
        String expectedStr = "tcejbo";
        assertNotEquals(expectedStr,actualStr);
    }

}