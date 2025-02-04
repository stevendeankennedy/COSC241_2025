package edu.frostburg.cosc241.lab0000;

import edu.frostburg.cosc241.tests.sp24.L0000Test;

/**
 * The driver class is your testing class.  This part is not graded.
 * 	Use the driver class to make sure that your code is correct.
 */

public class SKL0000Driver {

	public static void main(String[] args) {
		SKL0000 lab = new SKL0000();
		
//		L0000Test myTest = new L0000Test("Your name", "the date", lab);
		L0000Test myTest = new L0000Test("Your name", "the date", lab, "L0000Test.in", true);

		myTest.run();
//		SKL0000 lab = new SKL0000();
//		
//		String text = lab.getGreeting();
//		System.out.println(text);
//		
//		int result = lab.multiply(5, 5);
//		System.out.println(result);
//		
//		int n = 6;
//		System.out.println(lab.isOdd(n));
//		
//		int maybePrime = 100;
//		System.out.println(maybePrime + "? " + lab.isPrime(maybePrime));
	}

}
