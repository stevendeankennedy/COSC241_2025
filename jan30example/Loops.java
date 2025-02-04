package jan30example;

public class Loops {

	/**
	 * Prints some numbers up to count
	 * @param count numbers
	 */
	public void runExample1(short count) {
		for(int i=0; i < count; i++) {
			System.out.println(i);
		}
	}
	
	/**
	 * Prints out numbers on a line, separated by commas
	 * 	Reminder: this style of problem is called a "fencepost" problem
	 * @param count the number of digits to print
	 */
	public void runExample2(short count) {
		for(int i=0; i < count-1; i += 1) {
			System.out.print(i + ",");
		}
		System.out.println(count-1);
	}
	
	// Thanks, Kevin!
	public void runExample3(short count) {
		for (int i=1; i <= count; i+=1) {
			System.out.println(i);
		}
	}
	
	/**
	 * Prints every letter of the word on a separate line.
	 * 	Thanks, Aom, Chris, Isaac and others
	 * @param word the word to print
	 */
	public void runExample4(String word) {
		// run through letters
		for(int i=0; i<word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		// print letter
	}
	
	/**
	 * Print word in reverse
	 *  Thanks, Isaac and Cameron
	 * @param word
	 */
	public void runExample5(String word) {
		for(int i=word.length()-1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
		System.out.println();
	}
}
