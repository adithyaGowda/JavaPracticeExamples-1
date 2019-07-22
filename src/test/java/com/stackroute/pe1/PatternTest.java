package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {

    private Pattern pattern;

    @Before
    public void setup(){
        pattern = new Pattern();
    }

    @After
    public void tearDown(){
        pattern = null;
    }

    @Test
    public void inputElementsGivesPattern() {
        assertEquals(6, pattern.patternGeneration(3));
    }

    @Test
    public void inputElementsGivesPatternAsOutput() {
        assertEquals(10, pattern.patternGeneration(4));
    }

    @Test
    public void inputElementIsZeroOutputIs() {
        assertEquals(0, pattern.patternGeneration(0));
    }

    @Test
    public void inputElementIsZeroOutputIsNotNull() {
        assertNotNull( pattern.patternGeneration(0));
    }


}