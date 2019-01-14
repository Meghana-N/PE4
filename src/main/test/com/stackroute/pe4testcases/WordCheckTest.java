package com.stackroute.pe4testcases;

import com.stackroute.pe4.WordCheck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordCheckTest {
    WordCheck wordCheck;
    @Before
    public void setUp()  {
        wordCheck = new WordCheck();
    }

    @After
    public void tearDown() throws Exception {
        wordCheck = null;
    }

    @Test
    public void testCheckWordSuccess() {
        Boolean actualValue = wordCheck.checkWord("Harry says good morning");
        Boolean expectedValue = true;
        assertNotEquals(expectedValue,actualValue);
    }

    @Test
    public void testCheckWordFailure() {
        Boolean actualValue = wordCheck.checkWord("says good morning");
        Boolean expectedValue = true;
        assertNotEquals(expectedValue,actualValue);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(wordCheck.checkWord(null));
    }
}