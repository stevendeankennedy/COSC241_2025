package mar25example;

/**
 * Recursion examples.
 * Special thanks to Isaac, Donald, Chris, Ellie, and Madison!
 */

public class AlgoExample {

	public static void main(String[] args) {
//		runExample1();
//		runExample2('A', 4);
//		long p = pow(2, 5);
//		System.out.println(p);
		
		long f = fib(46 );
		System.out.println(f);
	}
	
	 

	private static long fib(int i) {
		// base case
		if (i == 0 || i == 1) {
			return 1;
		}
		// recursive case (fib(i))
		return fib(i-1) + fib(i-2);
	}



	/**
	 * returns the power of a to pow (a^pow)
	 * Thanks Madison!
	 * @param a
	 * @param pow
	 */
	private static long pow(int a, int b) {
		// base case
		if (b == 0) { // ie. 2^0 == 1
			return 1;
		}
		
		// recursive case
		System.out.println(a + "^" + b);
		return a * pow(a, b-1);
	}

	/**
	 * Prints a letter a bunch of times.  Special thanks to Isaac
	 */
	private static void runExample2(char x, int i) {
		// base case
		if (i == 0) {
			return;
		}
		
		// recursive case
		System.out.print(x + "" + i + " ");
		runExample2(x, i - 1);
		System.out.print(x + "" + i + " ");
		

	}

	/**
	 * Infinite recursion!!!!! o_0
	 */
	private static void runExample1() {
		runExample1();
	}

}
