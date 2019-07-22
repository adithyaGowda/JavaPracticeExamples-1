package com.stackroute.pe1;

import java.util.Scanner;
public class GuessCorrectly {
//    public static void main(String[] args) {
//
//
//
//
//        System.out.println("Guess a Number: ");
//        Scanner sc = new Scanner(System.in);
//        int data = sc.nextInt();
//    }
    public String guessingCorrectly(int data){

        int x = 30;
        if (data >= 1 && data <= 50) {

            if(data == x) {
                return "The number you entered is guessed properly";
            }

            else if(data > x) {
                return "The number you entered is greater than the original number";
            }

            else if(data < x) {
                return "The number you entered is Lesser than the original number";
            }

        }

        else {
            return "Given Number is not in the bounds,give a number that is greater than 1 and less than 50";
        }

        return null;

    }
}
