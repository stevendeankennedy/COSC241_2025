package edu.frostburg.cosc241.lab0000;

/**
 * Lab 0000 - Fundamental Java
 * 
 * 
 */

public class SKL0000 {

	/**
	 * Returns a "Hello" greeting.
	 * @return
	 */
	public String getGreeting() {
		return "Hello";
	}
	
	/**
	 * 4) Returns x * y.  
	 * @param x
	 * @param y
	 * @return
	 */
	public int multiply(int x, int y) {
		return x * y;
	}
	
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
	
	/**
	 * 7) Checks if a number is prime and returns true if it is, or false
	 * @param p a possible prime number
	 * @return
	 */
	public boolean isPrime(int p) {
		for (int i=2; i<p/2; i++) {
			if (p%i==0) { // if p is divisible by i, it can't be prime
				return false;
			}
		}
		return true;
	}
	
	public String concat(String s1, String s2) {
		return s1 + s2;
	}
}
