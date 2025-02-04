package jan30example;

/**
 * Driver class for today's examples.
 * 
 * @author sdkennedy + friends
 */
public class LoopsAndStrings {

	// start here!
	public static void main(String[] args) {
		Loops loopExamples = new Loops();
		Strings strExamples = new Strings();
		
		short count = 5;
		loopExamples.runExample1(count);
		loopExamples.runExample2(count);
		loopExamples.runExample3(count);
		
		String word = "Pineapple";
		strExamples.runExample1(word);
		strExamples.runExample2(word);
		
		loopExamples.runExample4(word);
		loopExamples.runExample5(word);
	}
}
