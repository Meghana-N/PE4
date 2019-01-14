package com.stackroute.pe4testcases;

import com.stackroute.pe4.TotalCharacterOccurence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TotalCharacterOccurenceTest {
    TotalCharacterOccurence characterOccurence;
    @Before
    public void setUp()  {
        characterOccurence = new TotalCharacterOccurence();
    }

    @After
    public void tearDown() throws Exception {
        characterOccurence = null;
    }

    @Test
    public void testCountCharacterOccurenceSuccess() {
        String inputString = "She sells seashells by the seashore";
        int actualValue = characterOccurence.countCharacterOccurence(inputString,"h");
        int expectedValue = 4;
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testCountCharacterOccurenceFailure() {
        String inputString = "She sells seashells by the seashore";
        int actualValue = characterOccurence.countCharacterOccurence(inputString,"y");
        int expectedValue = 4;
        assertNotEquals(expectedValue,actualValue);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(characterOccurence.countCharacterOccurence(null,null));
    }
}