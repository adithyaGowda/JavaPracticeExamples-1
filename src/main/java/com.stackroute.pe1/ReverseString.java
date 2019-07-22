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

         /*  
            Strings are immutable objects. 
            So, when you change the contents of a string you define, the contents of that object do not change.
            Although it seems to be changing, one more copy is created on the background memory.
        */

        /*
            You should use StringBuilder instead.
            When you create an object instance from the StringBuilder class and make the changes on that instance,
            no duplicate instance will be created on the memory, and the existing object instance will be used.
        */
        
        StringBuilder revStr= new StringBuilder();
        if(str==null)
            return null;

        else {
            for (int i = str.length() - 1; i >= 0; i--) {
                revStr.append(str.charAt(i));
            }
        }

        return revStr.toString();
    }
}
