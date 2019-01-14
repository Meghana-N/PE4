package com.stackroute.pe4testcases;

import com.stackroute.pe4.StringOccurenceMatcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StringOccurenceMatcherTest {
    StringOccurenceMatcher stringMatcher;
    @Before
    public void setUp()  {
        stringMatcher = new StringOccurenceMatcher();
    }

    @After
    public void tearDown() throws Exception {
        stringMatcher = null;
    }

    @Test
    public void testMatchStrSuccess() {
        ArrayList<String> actualValue = stringMatcher.matchString("She sells seashells by the seashore","se");
        ArrayList<String> occurence = new ArrayList<>();
        occurence.add("Found at: 4 - 6");
        occurence.add("Found at: 10 - 12");
        occurence.add("Found at: 27 - 29");
        ArrayList<String> expectedValue = occurence;
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testMatchStrFailure() {
        ArrayList<String> actualValue = stringMatcher.matchString("She sells seashells by the seashore","se");
        ArrayList<String> occurence = new ArrayList<>();
        occurence.add("Found at: 1 - 6");
        occurence.add("Found at: 10 - 11");
        ArrayList<String> expectedValue = occurence;
        assertNotEquals(expectedValue,actualValue);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(stringMatcher.matchString(null,null));
    }
}