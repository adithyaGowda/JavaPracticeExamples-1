package com.stackroute.pe1;

import java.util.Scanner;

public class Pattern {
//    public static void main(String[] args) {
//
//        System.out.println("Enter the value");
//
//        Scanner scn1 = new Scanner(System.in);
//
//        int n = scn1.nextInt();
//    }

    public int patternGeneration(int n){
            int count = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <=i; j++) {
                    System.out.print(i);
                    count++;
                }
            }
        return count;
    }

}
