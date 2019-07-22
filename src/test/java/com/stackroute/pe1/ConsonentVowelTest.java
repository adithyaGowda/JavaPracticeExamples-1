package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsonentVowelTest {

    private ConsonentVowel consonentVowel;

    @Before
    public void setup(){
        consonentVowel= new ConsonentVowel();
    }

    @After
    public void tearDown(){
        consonentVowel=null;
    }

    @Test
    public void inputCharacterShouldReturnVowel() {

        assertEquals("Vowel",consonentVowel.vowelConsonent("a"));
    }

    @Test
    public void inputCharacterShouldReturnConsonent() {

        assertEquals("Consonent",consonentVowel.vowelConsonent("p"));
    }

    @Test
    public void inputCharacterShouldReturnEither() {

        assertEquals("Vowel" ,consonentVowel.vowelConsonent("ab"));
    }

    @Test
    public void inputCharacterShouldReturnBoth() {

        assertEquals("Consonent" ,consonentVowel.vowelConsonent("ba"));
    }

    @Test
    public void nullInputGivesNullOutput() {

        assertNull(consonentVowel.vowelConsonent(null));
    }


}