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



        String data = "";

        if(input == null)
            return null;

        for(int i=0;i<n;i++) {
            for (int j = input.length() - n; j < input.length(); j++) {
                data = data + (input.charAt(j));
            }

        }
            String x = (input + data);

    return x;
    }
}
