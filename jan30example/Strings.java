package jan30example;

public class Strings {

	/**
	 * Prints the passed word in upper case letters.
	 * 	Thanks Isaac!
	 * @param word a string to convert
	 */
	public void runExample1(String word) {
		word = word.toUpperCase();
		System.out.println(word);
	}
	
	/**
	 * Prints word in lower and upper case, together
	 * 	Thanks Isaac!
	 * @param word the word to use
	 */
	public void runExample2(String word) {
		word = word.toLowerCase();
		String word1 = word.toUpperCase();
		
		word = word + word1;
		System.out.println(word);
	}
}
