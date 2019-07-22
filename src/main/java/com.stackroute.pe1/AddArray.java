package com.stackroute.pe1;

//import java.util.Scanner;

public class AddArray {
//    public static void main(String[] args) {
//
//        Scanner scn1 = new Scanner(System.in);
//        System.out.println("Enter the number of elements");
//        int n = scn1.nextInt();
//    }

    public int addingArray(int n,int[] arr){

        if(arr == null )
            return 0;

        int sum=0;

        for (int i=0; i<n; i++){

            sum = sum + arr[i];

    }
        return sum;

    }
}
