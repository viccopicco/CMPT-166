/**
 * 
 * LAB 2 (Defining Classes)
 * 
 * @author Ere Santos <ere.santos@twu.ca>
 * Date: February 11, 2016
 * 
 * Input: Numbers for fractions.
 * Output: Fractions and fraction equivalency in boolean types.
 * 
 */

import java.util.Scanner;

public class Fraction {
	static Scanner keyboardInput = new Scanner(System.in);
	static int numerator;
	static int denominator;
	private void setNumerator(int numerator){
		this.numerator=numerator;
	}
	private void setDenominator(int denominator){
		this.denominator=denominator;
	}
	private static void displayFraction(int x1, int x2){
		System.out.println(x1+"/"+x2);
	}
	private boolean equals(Fraction otherFraction){
		boolean numeratorBool = (this.numerator == otherFraction.numerator);
        boolean denominatorBool = (this.numerator == otherFraction.numerator);
        return (numeratorBool && denominatorBool);
	}
	private Fraction(int initialNumerator, int initialDenominator){
		numerator = initialNumerator;
		denominator = initialDenominator;
	}
	private static int numeratorInput(Scanner keyboardInput){
		System.out.println("Think of a numerator... Now enter it: ");
		return keyboardInput.nextInt();
	}
	private static int denominatorInput(Scanner keyboardInput){
		System.out.println("Now think of a denominator "
				+ "that's not zero... Now enter that: ");
		return keyboardInput.nextInt();
	}
	private static boolean doRepeat(Scanner keyboardInput){
		String NO = "no";
		System.out.println("Do you wish to try again?");
		System.out.println("If yes type yes, if no... yeah.. Type no.");
		String repeat = keyboardInput.next();
		if(repeat.equals(NO)){
			System.out.println("Goodbye now!");
			return false;
		}
		else{
			return true;
		}
	}
	public static void main(String args[]){
		int num0;
		int den0;
		boolean equality;
		boolean repeat = true;
		while(repeat){
			num0 = numeratorInput(keyboardInput);
			den0 = denominatorInput(keyboardInput);
			Fraction initialFraction = new Fraction(num0,den0);
			System.out.println("Okay, so your fraction is "
			+num0+"/"+den0+", Input another fraction");
			num0 = numeratorInput(keyboardInput);
			den0 = denominatorInput(keyboardInput);
			equality = initialFraction.equals(new Fraction(num0,den0));
			if(equality){
				System.out.println("The fractions are equivalent!");
			}
			else{
				System.out.println("Ugh oh, the fractions aren't equal");
			}
			repeat = doRepeat(keyboardInput);
		}
	}
}
