import main.java.StrOccurenceMatcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StrOccurenceMatcherTest {
    StrOccurenceMatcher obj;
    @Before
    public void setUp()  {
        obj = new StrOccurenceMatcher();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void testMatchStrSuccess() {
        ArrayList<String> actualStr = obj.matchStr("She sells seashells by the seashore","se");
        ArrayList<String> occurence = new ArrayList<>();
        occurence.add("Found at: 4 - 6");
        occurence.add("Found at: 10 - 12");
        occurence.add("Found at: 27 - 29");
        ArrayList<String> expectedStr = occurence;
        assertEquals(expectedStr,actualStr);
    }

    @Test
    public void testMatchStrFailure() {
        ArrayList<String> actualStr = obj.matchStr("She sells seashells by the seashore","se");
        ArrayList<String> occurence = new ArrayList<>();
        occurence.add("Found at: 1 - 6");
        occurence.add("Found at: 10 - 11");
        ArrayList<String> expectedStr = occurence;
        assertNotEquals(expectedStr,actualStr);
    }
}