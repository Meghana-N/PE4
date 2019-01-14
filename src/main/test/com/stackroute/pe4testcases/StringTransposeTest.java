package com.stackroute.pe4testcases;

import com.stackroute.pe4.StringTranspose;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    StringTranspose stringTransopse;
    @Before
    public void setUp()  {
        stringTransopse = new StringTranspose();
    }

    @After
    public void tearDown() throws Exception {
        stringTransopse = null;
    }

    @Test
    public void testTransposeStringSuccess() {
        String actualValue = stringTransopse.transposeString("good morning");
        String expectedValue = "doog gninrom";
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testCheckForGradeSuccess() {
        String actualValue = stringTransopse.transposeString("object oriented");
        String expectedValue = "tcejbo";
        assertNotEquals(expectedValue,actualValue);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(stringTransopse.transposeString(null));
    }

}