package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPalindromeTest {

    private CheckPalindrome checkPalindrome;

    @Before
    public void setup(){
        checkPalindrome = new CheckPalindrome();
    }

    @After
    public void tearDown(){
        checkPalindrome = null;
    }

    @Test
    public void inputStringGivesPalindromeAndLesser(){
        assertEquals("It is a palindrome and sum of even numbers is less than 25", checkPalindrome.palindromeCheck("1234321"));
    }

    @Test
    public void inputStringGivesPalindromeAndGreater(){
        assertEquals("It is a palindrome and the sum of even numbers is greater than 25", checkPalindrome.palindromeCheck("2468642"));
    }

    @Test
    public void inputStringFailsToGivePalindrome(){
        assertEquals("It is not a palindrome", checkPalindrome.palindromeCheck("1234"));
    }

    @Test
    public void inputStringIsNullAndNullOutput(){
        assertNotNull(checkPalindrome.palindromeCheck(null));
    }



}