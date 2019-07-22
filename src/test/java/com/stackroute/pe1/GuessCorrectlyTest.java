package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessCorrectlyTest {

    private GuessCorrectly guessCorrectly;

    @Before
    public void setup(){
        guessCorrectly = new GuessCorrectly();
    }

    @After
    public void tearDown(){
        guessCorrectly = null;
    }


    @Test
    public void inputElementShouldReturnCorrectly() {

        assertEquals("The number you entered is guessed properly", guessCorrectly.guessingCorrectly(30));
    }

    @Test
    public void inputElementShouldReturnCorrectlyAndGreater() {

        assertEquals("The number you entered is greater than the original number", guessCorrectly.guessingCorrectly(35));
    }

    @Test
    public void inputElementShouldReturnCorrectlyAndLesser() {

        assertEquals("The number you entered is Lesser than the original number", guessCorrectly.guessingCorrectly(25));
    }


    @Test
    public void zeroInputGivesDefaultStatement() {

        assertEquals("Given Number is not in the bounds,give a number that is greater than 1 and less than 50", guessCorrectly.guessingCorrectly(0));
    }


}