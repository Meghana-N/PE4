import main.java.WordsSort;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class WordsSortTest {
    WordsSort obj;
    @Before
    public void setUp()  {
        obj = new WordsSort();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void testTransposeStringSuccess() {
        ArrayList<String> actualStr = obj.sortWords("zara says good morning");
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("good");
        wordList.add("morning");
        wordList.add("says");
        wordList.add("zara");
        ArrayList<String> expectedStr = new ArrayList<>();
        expectedStr = wordList;
        assertEquals(expectedStr,actualStr);
    }

    @Test
    public void testTransposeStringFailure() {
        ArrayList<String> actualStr = obj.sortWords("zara says good");
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("zara");
        wordList.add("good");
        wordList.add("morning");
        wordList.add("says");
        ArrayList<String> expectedStr = new ArrayList<>();
        expectedStr = wordList;
        assertNotEquals(expectedStr,actualStr);
    }
}