/**
 * 
 * HW2 Part A - Programming Projects #1 (p. 253)
 * 
 * @author Ere Santos <ere.santos@twu.ca>
 * Date: February 9, 2016
 * 
 * Input: number for beer song
 * Output: Wicked Cool beer song
 * 
 * @param num2Let
 * 
 */

import java.util.Scanner;

public class HW2_Part_A {
	/* I create methods that contain numbers from twenty to ninety
	 * and One to nineteen to that I can use them when I decide to
	 * convert my integer values to English
	 */
	
	public static String[] twentyTo90 = {
	    "",				"",
	    "Twenty",		"Thirty",
	    "Forty", 		"Fifty",
	    "Sixty",		"Seventy",
	    "Eighty",		"Ninety"
	    };
	
	public static String[] oneTo19 = {
	    "",				"One",
	    "Two",			"Three",
	    "Four",			"Five",
	    "Six",			"Seven",
	    "Eight",		"Nine",
	    "Ten",			"Eleven",
	    "Twelve",		"Thirteen",
	    "Fourteen",		"Fifteen",
	    "Sixteen",		"Seventeen",
	    "Eighteen",		"Nineteen"
	    };
	/* 
	 * I create a method that converts my digits into English
	 */
	public static String convertToEnglish(final int num2Let) {
        if (num2Let < 20) {
            return oneTo19[num2Let];
        }
        if (num2Let < 100) {
            return twentyTo90[num2Let / 10] + ((num2Let % 10 != 0) ? " " : "") + oneTo19[num2Let % 10];
        }
        return convertToEnglish(num2Let);
	}
	/*
	 * This method creates the loops for our song!
	 */
	public static void songLoop(){
		/* 
		 * This is the section to obtain the user input.
		 */
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Hello sailor! How much beer? Is on the wall?");
		int bottles = keyboardInput.nextInt();
		int bottle = bottles;
		if(bottles > 99);{
			bottle=99;
		}
		if (bottles <= 0);{
			bottle=0;
		}
		if(bottles >= 1);{
			bottle=bottles;		
		}
		if(bottles <= 99);{
			bottle=bottles;
		}
		/* Finally we print out the stanzas*/
		while (bottle>=2){
			System.out.println("");
			System.out.println(convertToEnglish(bottle) + " bottles of beer on the wall,");
			System.out.println(convertToEnglish(bottle) + " bottles of beer!");
			System.out.println("You take one down, pass it around,");
			System.out.println(convertToEnglish(bottle-1)+" bottles of beer on the wall!");
			bottle -=1;
		}
		System.out.println("");
		System.out.println("One bottle of beer on the wall,");
		System.out.println("One bottle of beer!");
		System.out.println("You take one down, pass it around,");
		System.out.println("No more bottles of beer on the wall!");
	}
				
	public static void main(String args[]){
		songLoop();
	}
	

}
