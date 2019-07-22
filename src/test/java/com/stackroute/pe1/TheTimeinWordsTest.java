package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheTimeinWordsTest {

    private TheTimeinWords timeinWord;

    @Before
    public void setup(){
        timeinWord = new TheTimeinWords();
    }

    @After
    public void tearDown(){
        timeinWord = null;
    }

    @Test
    public void inputStringGivesTime() {
        assertEquals("quarter past ten", timeinWord.timeInWords(10,15));
    }

    @Test
    public void inputStringGivesTime2() {
        assertEquals("three o' clock", timeinWord.timeInWords(3,00));
    }

    @Test
    public void inputStringGivesNull() {
        assertNull( timeinWord.timeInWords(null));
    }
}