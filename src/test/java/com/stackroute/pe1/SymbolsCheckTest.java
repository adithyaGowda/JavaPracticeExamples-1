package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SymbolsCheckTest {

    private SymbolsCheck symbolsCheck;

    @Before
    public void setup(){
        symbolsCheck = new SymbolsCheck();
    }

    @After
    public void tearDown(){
        symbolsCheck = null;
    }

    @Test
    public void inputCharaterChecksForCapital() {

        assertEquals("Capital letter",symbolsCheck.checkSymbols('A'));
    }

    @Test
    public void inputCharaterChecksForSpecialCharacter() {

        assertEquals("Special character",symbolsCheck.checkSymbols('#'));
    }

    @Test
    public void inputCharaterChecksForInvalidCharacter() {

        assertEquals("invalid character",symbolsCheck.checkSymbols('@'));
    }


}