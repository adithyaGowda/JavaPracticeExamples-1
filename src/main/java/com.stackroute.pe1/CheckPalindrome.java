package com.stackroute.pe1;

import java.util.Scanner;

public class CheckPalindrome {
//    public static void main(String[] args) {
//
//        System.out.println("Enter the value");
//
//        Scanner scn1 = new Scanner(System.in);
//    }



//        original = scn1.nextLine();

public String palindromeCheck(String input){

    if (input == null)
        return "null";

    String original=input, reverse = "";
        for ( int i = original.length() - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse)) {


            int result = Integer.parseInt(original);
            int sum=0;
            while(result>0) {
                int rem = result % 10;


                if(rem%2==0)
                {
                    sum=sum+rem;
                }
                result=result/10;

            }
            if(sum > 25)
            return "It is a palindrome and the sum of even numbers is greater than 25";

            else
                return "It is a palindrome and sum of even numbers is less than 25";

        }

        else
            return "It is not a palindrome";


    }
}



