package com.stackroute.pe1;

import java.util.Scanner;
public class TheTimeinWords {
//    public static void main(String[] args) {
//
//
//      System.out.println(timeInWords(10,15)); // quarter past ten
//		System.out.println(timeInWords(3,00)); //  three o' clock
//		System.out.println(timeInWords(5,47)); //  thirteen minutes to six }

    public String timeInWords(int h, int m) 
	{
        if( h == null || m == null)
            return null;
            
		Map<Integer,String> myMap = new HashMap<Integer,String>();
		myMap.put(1, "one");myMap.put(2, "two");myMap.put(3, "three");myMap.put(4, "four");myMap.put(5, "five");myMap.put(6, "six");
		myMap.put(7, "seven");myMap.put(8, "eight");myMap.put(9, "nine");myMap.put(10, "ten");myMap.put(11, "eleven");myMap.put(12, "twelve");
		myMap.put(13, "thirteen");myMap.put(14, "fourteen");myMap.put(15, "quarter");myMap.put(16, "sixteen");myMap.put(17, "seventeen");myMap.put(18, "eighteen");
		myMap.put(19, "nineteen");myMap.put(20, "twenty");myMap.put(30, "half");
		
		if(m==0) return myMap.get(h) + " o' clock";
		else if(m>=1 && m<=30)
		{
			if(m==30 || m==15) return myMap.get(m) + " past " + myMap.get(h);
			else if(m<=20)
			{
				return myMap.get(m) + " minute past " + myMap.get(h);
			}
			else
			{
				return myMap.get(20) +" " + myMap.get(m-20) +" minutes past " + myMap.get(h);
			}
		}
		else
		{
			if(60-m == 15) return myMap.get(15) + " to " + myMap.get(h+1); 
			else if(60-m<=20)
			{
				return myMap.get(60-m) + " minutes to " + myMap.get(h+1);
			}
			else
			{
				return myMap.get(20) +" " + myMap.get(60-m-20) +" minutes to " + myMap.get(h+1);
			}
		}
	 }
}
