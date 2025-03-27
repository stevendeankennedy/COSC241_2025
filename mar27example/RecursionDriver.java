package mar27example;

import java.util.Scanner;

public class RecursionDriver {

	public static void main(String[] args) {
		RecursionMachine R = new RecursionMachine();
		
		// TODO: change the System.in to a file
		System.out.print("Enter an infix expression>");
		Scanner in = new Scanner(System.in);
		double result = R.evaluate(in);
		System.out.printf("The answer is %f%n", result);
	}

}
