package com.stackroute.pe1;




public class TomJerry {
//    public static void main(String[] args) {
//
//        System.out.println("Enter the value");
//
//        Scanner scn1 = new Scanner(System.in);
//
//        int input = scn1.nextInt();
//    }

    public String tomJerry(int input) {

        if (input > 20 && input < 30) {

            if (input % 2 != 0) {

                return "Tom";
            }
            else {

                return "Jerry";
            }

        }
        return null;
    }

}
