package com.stackroute.pe1;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class SymbolsCheck {
//    public static void main(String[] args) {
//
//        System.out.println("Enter the character");
//        Scanner scn1 = new Scanner(System.in);
//
//        char input = scn1.next().charAt(0);
//    }

    public String checkSymbols(char input){
        int x = (int) input;

        if (x >= 65 && x <= 90){
            return "Capital letter";
        }
        else if(x >= 97 && x <= 122){
            return "Small letter";
        }
        else if(x >= 48 && x <= 57){
            return "Numbers";
        }
        else if(x >= 32 && x <= 47){
            return "Special character";
        }
        else
            return "invalid character";
    }
}
