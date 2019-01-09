import main.java.WordCheck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordCheckTest {
    WordCheck obj;
    @Before
    public void setUp()  {
        obj = new WordCheck();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void testCheckWordSuccess() {
        Boolean actualStr = obj.checkWord("Harry says good morning");
        Boolean expectedStr = true;
        assertNotEquals(expectedStr,actualStr);
    }

    @Test
    public void testCheckWordFailure() {
        Boolean actualStr = obj.checkWord("says good morning");
        Boolean expectedStr = true;
        assertNotEquals(expectedStr,actualStr);
    }
}