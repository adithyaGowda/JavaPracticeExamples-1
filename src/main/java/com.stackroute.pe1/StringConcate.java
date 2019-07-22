package com.stackroute.pe1;

//import java.util.Scanner;

public class StringConcate {
//    public static void main(String[] args) {
//
//
//        Scanner scn1 = new Scanner(System.in);
//        System.out.println("Enter the string");
//        String input = scn1.next();
//        System.out.println("Enter the no. of elements ");
//        int n = scn1.nextInt();
//    }


    public String concateString(int n,String input){

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
          
        StringBuilder data = new StringBuilder(); //     

        if(input == null)
            return null;

        for(int i=0;i<n;i++) {
            for (int j = input.length() - n; j < input.length(); j++) {
                data.append(input.charAt(j));
            }

        }
        String x = (input + data);

    return x;
    }
}
