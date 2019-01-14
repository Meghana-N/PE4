package com.stackroute.pe4testcases;

import com.stackroute.pe4.WordSort;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class WordSortTest {
    WordSort wordSort;
    @Before
    public void setUp()  {
        wordSort = new WordSort();
    }

    @After
    public void tearDown() throws Exception {
        wordSort = null;
    }

    @Test
    public void testSortWordsSuccess() {
        ArrayList<String> actualValue = wordSort.sortWords("zara says good morning");
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("good");
        wordList.add("morning");
        wordList.add("says");
        wordList.add("zara");
        ArrayList<String> expectedValue = new ArrayList<>();
        expectedValue = wordList;
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testSortWordsFailure() {
        ArrayList<String> actualValue = wordSort.sortWords("zara says good");
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("zara");
        wordList.add("good");
        wordList.add("morning");
        wordList.add("says");
        ArrayList<String> expectedValue = new ArrayList<>();
        expectedValue = wordList;
        assertNotEquals(expectedValue,actualValue);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(wordSort.sortWords(null));
    }
}