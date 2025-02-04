package jan28example;
/**
 * (This type of comment is called a JavaDoc)
 * 
 * This is our definition for a student class.
 * 	Students can study, sleep, and eat.
 * 
 * @author sdkennedy, and others
 * @version 1.28.2025
 */
public class Student {
	
	// attributes for a student
	public String name;
	public String major;
	public int age;
	
	/**
	 * Study is something students do.  This method just prints a message.
	 * 
	 * @param subject what they would study
	 */
	public void study(String subject) {  // concatenation, thanks, Ellie!
		System.out.println(name + " is studying " + subject);
	}
	
	/**
	 * Prints a sleeping message.
	 */
	public void sleep() {
		System.out.println(name + " is sleeping because that's what " +
				age + " year olds do.");
	}
	
	/**
	 * Print an eating message.
	 * 
	 * @param food what the student will eat
	 */
	public void eat(String food) {  // Thanks, Jackson!
		System.out.println(name + " is eating a " + 
				major + " major's favorite snack, " + food + ".");
	}
}
