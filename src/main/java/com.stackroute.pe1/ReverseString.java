package com.stackroute.pe1;

import java.util.Scanner;
public class ReverseString {
//    public static void main(String[] args) {
//
//
//
//        Scanner scn1 = new Scanner(System.in);
//
//        System.out.print("Enter a string :");
//        String str = scn1.nextLine();}

    public String reverseStringData(String str){
        String revStr=" ";
        if(str==null)
            return null;

        else {
            for (int i = str.length() - 1; i >= 0; i--) {
                revStr = revStr + str.charAt(i);
            }
        }

        return revStr;
    }
}
