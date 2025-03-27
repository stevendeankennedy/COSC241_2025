package mar27example;

import java.util.Scanner;

public class RecursionMachine {

	public double evaluate(Scanner in) {
		// if it is a literal number, just return that number
		if (in.hasNextDouble()) {
			return in.nextDouble();
		}
		// recursive case
		// need the operator
		String op = in.next();
		double a = in.nextDouble();
		double b = in.nextDouble();
		
		switch (op) {
		case "+":
			return a + b;
		case "=":
			return a - b;
		case "/":
			return a / b;
		}
		
		return 0.0;
	}
}
