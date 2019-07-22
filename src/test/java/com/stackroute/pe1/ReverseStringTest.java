package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    private ReverseString reverseString;

    @Before
    public void setup(){
        reverseString = new ReverseString();
    }

    @After
    public void tearDown(){
        reverseString = null;
    }

    @Test
    public void inputStringGivesReverseString() {
        assertEquals("nodnol", reverseString.reverseStringData("london"));
    }

    @Test
    public void inputStringGivesReverseString1() {
        assertEquals(" ayhtida", reverseString.reverseStringData("adithya"));
    }

    @Test
    public void inputStringGivesNull() {

        assertNull( reverseString.reverseStringData(null));
    }
}