/**
 * 
 * HW 3: Arrays Part A - ArrayStas
 * 
 * @author Ere Santos <ere.santos@twu.ca>
 * Date: March 2, 2016
 * 
 */
import java.util.Arrays;
import java.util.Random;

public class ArrayStas {
	public static void arrayAssign(){
		/**
		 * Create an array with 300 random numbers between
		 * 0-100.
		 */
		Random random = new Random();
		int numAmount = 300;
		int[] array = new int[300];
		for(int i = 0; i < numAmount; i++){
			array[i] = random.nextInt(100)+1;
		}
		/**
		 * Now to sort the array.
		 */
		Arrays.sort(array);
		/**
		 * Now to display the array.
		 */
		for(int n = 20; n <= 300; n+=20){
			for(int i = (n-20); i < n; i++){
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------------"
				+ "--------------------------------");//line separator
		/**
		 * Initializing Counter variables
		 */
		int one2Twenty = 0;
		int twentyone2Forty = 0;
		int fortyone2Sixty = 0;
		int sixtyone2Eighty = 0;
		int eightyone2Hundy = 0;
		/**
		 * Commencing counting
		 */
		for (int i = 0; i < 300; i++){
			if(array[i]>=1 && array[i]<=20){
				one2Twenty++;
			}
			if(array[i]>=21 && array[i]<=40){
				twentyone2Forty++;
			}
			if(array[i]>=41 && array[i]<=60){
				fortyone2Sixty++;				
			}
			if(array[i]>=61 && array[i]<=80){
				sixtyone2Eighty++;				
			}
			if(array[i]>=81 && array[i]<=100){
				eightyone2Hundy++;				
			}
		}
		/**
		 * Display result of counting
		 */
		System.out.print(" 1  -  20: ");
		System.out.println(asterisksMultiplier("*",one2Twenty) + " " + one2Twenty);
		System.out.print("21  -  40: ");
		System.out.println(asterisksMultiplier("*",twentyone2Forty) + " " + twentyone2Forty);
		System.out.print("41  -  60: ");
		System.out.println(asterisksMultiplier("*",fortyone2Sixty) + " " + fortyone2Sixty);
		System.out.print("61  -  80: ");
		System.out.println(asterisksMultiplier("*",sixtyone2Eighty) + " " + sixtyone2Eighty);
		System.out.print("81  - 100: ");
		System.out.println(asterisksMultiplier("*",eightyone2Hundy) + " " + eightyone2Hundy);
		
		
	}
	/**
	 * Method to multiply the asterisks symbol
	 * @param s
	 * @param n
	 * @return
	 */
	public static String asterisksMultiplier(String s,int n){
		for(int i=1; i<=n;i++){
			System.out.print(s);
		}
		return s;
		
	}
	public static void main (String args[]){
		arrayAssign();
	}
}
