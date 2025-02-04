package feb04example;

/**
 * Another example, this one messes with Strings
 * 
 * @author sdkennedy and 241
 */
public class Words {

	/**
	 * Prints each character on its own line
	 * 
	 * Special thanks to Aom
	 * @param word
	 */
	public void printLetters(String word) {
		for (int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			int code = ch;
			System.out.printf("%c:%d%n", ch, code);
		}
	}
	
	/**
	 * Caesar cipher.  Only works on lower case letters, will force lower.
	 * 
	 * Thanks Ashley, Aom, Isaac, Chris, others?
	 * @param word
	 * @param key
	 * @return the cyper text
	 */
	public String encodeCaesar(String word, int key) {
		String cypher = "";
		word = word.toLowerCase();
		for (int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			int code = ch + key;
			
			// adjust code so we only use letters
			if (code > 'z') {
				code -= 26;
			} else if (code < 'a') {
				code += 26;
			}
			
			char ch1 = (char)code; // aka "cast" it to char
			cypher += ch1;
		}
		return cypher;
	}
	
	public String decodeCaesar(String word, int key) {
		return encodeCaesar(word, -key);
	}
	
	public void conditionals() {
		int a = 1;
		int b = 2;
		boolean p = true;
		boolean q = false;
		
		if (p && q) { // and
			System.out.println("true");
		} else {
			System.out.println("and");
		}
			
		
		if (p || q) { // or
			System.out.println("or");
		}
		
		if (!p) {
			System.out.println("not");
		}
	}
}
