
import main.java.ReplaceOccurence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceOccurenceTest {
    ReplaceOccurence obj;
    @Before
    public void setUp()  {
        obj = new ReplaceOccurence();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void testReplaceCharOccurenceSuccess() {
        String actualStr = obj.replaceStringOccurence("daily dry");
        String expectedStr = "faily fry";
        assertEquals(expectedStr,actualStr);
    }

    @Test
    public void testReplaceCharOccurenceFailure() {
        String actualStr = obj.replaceStringOccurence("daily dry");
        String expectedStr = "daily dry";
        assertNotEquals(expectedStr,actualStr);
    }
}