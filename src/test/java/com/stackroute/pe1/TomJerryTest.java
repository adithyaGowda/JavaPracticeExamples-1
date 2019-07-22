package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {

     private TomJerry tomJerryVariabe ;

//    @Test
//    public void givenIntegerShouldReturnEven() {
//
//        int actualResult = tomJerryVariabe.tomJerry(22);
//
//        assertEquals(22, actualResult);
//    }
    @Before
    public void setup(){
        tomJerryVariabe = new TomJerry();
    }
    @After
    public void tearDown(){
        tomJerryVariabe = null;
    }

    @Test
    public void givenIntegerShouldReturnOdd() {

        assertEquals("Tom",tomJerryVariabe.tomJerry(27));
    }

    @Test
    public void givenIntegerShouldReturnEven() {

        assertEquals("Jerry",tomJerryVariabe.tomJerry(22));
    }

    @Test
    public void givenIntegerShouldReturnNull() {

        assertNull(tomJerryVariabe.tomJerry(40));
    }

//    @Test
//    public void tomJerry() {
//    }

//    @Test
//    public void givenIntegerShouldReturnNothing() {
//
//        int actualResult = tomJerryVariabe.tomJerry(40);
//
//        assertEquals(40, actualResult);
//    }


}