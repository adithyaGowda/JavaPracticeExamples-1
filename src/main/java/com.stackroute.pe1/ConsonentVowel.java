package com.stackroute.pe1;

import java.util.Scanner;

public class ConsonentVowel {
//    public static void main(String[] args) {
//
//        System.out.println("Enter the value");
//        Scanner scn1 = new Scanner(System.in);
//
//        String word = scn1.next();
//    }

    public String vowelConsonent(String word) {

        if (word == null)
            return null;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                return "Vowel";
            }

            else {
                return "Consonent";
            }
        }

        return null;
    }

}
