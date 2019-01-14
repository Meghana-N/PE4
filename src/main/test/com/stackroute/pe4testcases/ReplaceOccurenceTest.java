package com.stackroute.pe4testcases;

import com.stackroute.pe4.ReplaceOccurence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceOccurenceTest {
    ReplaceOccurence replaceOccurence;
    @Before
    public void setUp()  {
        replaceOccurence = new ReplaceOccurence();
    }

    @After
    public void tearDown() throws Exception {
        replaceOccurence = null;
    }

    @Test
    public void testReplaceCharOccurenceSuccess() {
        String actualString = replaceOccurence.replaceStringOccurence("daily dry");
        String expectedValue = "faity fry";
        assertEquals(expectedValue,actualString);
    }

    @Test
    public void testReplaceCharOccurenceFailure() {
        String actualString = replaceOccurence.replaceStringOccurence("daily dry");
        String expectedValue = "daily dry";
        assertNotEquals(expectedValue,actualString);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(replaceOccurence.replaceStringOccurence(null));
    }
}