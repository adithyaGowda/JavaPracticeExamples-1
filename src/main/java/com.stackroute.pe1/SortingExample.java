package com.stackroute.pe1;

import java.util.Scanner;

public class SortingExample {
//    public static void main(String[] args) {
//
//
//        Scanner scn1 = new Scanner(System.in);
//
//        System.out.print("Enter no. of elements you want in array:");
//        n = scn1.nextInt();
//        int arr[] = new int[n];
//
//        System.out.print("Enter elements in array:");
//    }

//        for(int i=0;i<n;i++) {
//            arr[i] = scn1.nextInt();
//        }

public int sortingDescendingOrder(int n , int[] arr){

    if (arr == null)
        return 0;

    int  data, temp, sum = 0;
        for (int i = 0; i < n; i++){

            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            data = arr[i];

            if(data % 2 == 0){

                sum = sum + data;
            }

        }

        System.out.print("Descending Order:");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.print(arr[i] + ",");
        }

        System.out.print(arr[n - 1] + "\n");

        System.out.println("Sum of even numbers:"  + sum);

        return sum;
    }
}
