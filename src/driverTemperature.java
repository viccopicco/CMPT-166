public class driverTemperature {
	public static void main (String args[]){
		/*
		 * Here are the test temperature equalities, 
		 * value and scale changes, as well as other 
		 * and temperature modification 
		 * functionalities.
		 */
		
		Temperature tst1 = new Temperature(0,	'C');
		Temperature tst2 = new Temperature(32,	'F');
		Temperature tst3 = new Temperature(-40,	'C');
		Temperature tst4 = new Temperature(-40,	'F');
		Temperature tst5 = new Temperature(100,	'C');
		Temperature tst6 = new Temperature(212,	'F');
		
		System.out.println("Test 1: "+tst1);
		System.out.println("Test 2: "+tst2);
		System.out.println("Test 3: "+tst3);
		System.out.println("Test 4: "+tst4);
		System.out.println("Test 5: "+tst5);
		System.out.println("Test 6: "+tst6);
		
		System.out.println("");
		
		System.out.println("Testing the equalities of the "
				+ "first and third tests");
		System.out.println(tst3.isLess(tst1));
		System.out.println("Testing the equalities of the "
				+ "first and fifth tests");
		System.out.println(tst1.isGreater(tst5));
		
		System.out.println("");
		
		System.out.println("I shall now set the scale of test 6 to 'C'");
		tst6.setScale('C');
		System.out.println("Check it: "+tst6);
		
		System.out.println("");
		
		System.out.println("Getting Celcius of test 2");
		System.out.println(tst2.getCelsius());
		System.out.println("Getting Fahrenheit of test 3");
		System.out.println(tst3.getCelsius());
		System.out.println("I'm about to assign 10 degrees to test 1");
		tst1.setValue(10);
		System.out.println("Check it: "+tst1);
		
		System.out.println("");
		
		System.out.println("Here I shall finally change test 4 to +100 C!");
		tst4.setBoth(100, 'C');
		System.out.println("Check it: "+tst4);		
	}
}
