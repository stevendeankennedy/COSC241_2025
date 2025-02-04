package edu.frostburg.cosc241.lab0000;

import edu.frostburg.cosc241.lab.L0000.L0000JavaIntro;

/**
 * Lab 0000 - Fundamental Java
 * 
 * 
 */

public class SKL0000 implements L0000JavaIntro {

	/**
	 * Returns a "Hello" greeting.
	 * @return
	 */
	public String getGreeting() {
		return "Hello";
	}
	
//	/**
//	 * 4) Returns x * y.  
//	 * @param x
//	 * @param y
//	 * @return
//	 */
//	public int multiply(int x, int y) {
//		return x * y;
//	}
	
	/**
	 * 5) Returns true if a number is odd, false otherwise.
	 * @param a
	 * @return
	 */
	public boolean isOdd(int a) {
		if (a % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public String concat(String s1, String s2) {
		return s1 + s2;
	}

	@Override
	public String concat(String arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char getChar(String arg0, int arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getSubstring(String arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPrime(long p) {
		for (int i=2; i<=p/2; i++) {
			if (p%i==0) { // if p is divisible by i, it can't be prime
				return false;
			}
		}
		return true;
	}

	@Override
	public String removeVowels(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long multiply(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
}
