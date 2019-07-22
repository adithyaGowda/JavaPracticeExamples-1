package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringConcateTest {

    private StringConcate stringConcate;

    @Before
    public void setup(){
        stringConcate = new StringConcate();
    }

    @After
    public void tearDown(){
        stringConcate = null;
    }

    @Test
    public void inputStringConcateItself() {
        assertEquals("Stackrouterouterouterouterouteroute", stringConcate.concateString(5,"Stackroute"));
    }

    @Test
    public void inputStringConcateItselfAndReturn() {
        assertEquals("adithyahyahyahya", stringConcate.concateString(3,"adithya"));
    }

    @Test
    public void inputNullWillReturnError() {
        assertNull( stringConcate.concateString(3,null));
    }

    @Test
    public void inputStringWillReturnNotEqual() {
        assertNotEquals("adi", stringConcate.concateString(3,"adi"));
    }
}