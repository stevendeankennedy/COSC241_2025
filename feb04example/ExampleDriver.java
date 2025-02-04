package feb04example;

public class ExampleDriver {

	public static void main(String[] args) {
//		example1();
//		example2();
//		example3();
		runCypherExample("pizza");
	}
	
	public static void runCypherExample(String word) {
		Words w = new Words();
		String cypher = w.encodeCaesar(word, 1);
		System.out.printf("%s -> %s%n", word, cypher);
		String plain = w.decodeCaesar(cypher, 1);
		System.out.printf("%s -> %s%n", cypher, plain);

	}
	
	public static void example1() {
		// "You have to instantiate the class", Aom, 2/4/25
		Converter myConverter = new Converter();
		
		double usd = 10.50;
		double cad = myConverter.convert(usd);
		
//		System.out.println("$" + usd + " is $" + cad + " Canadian");
		System.out.printf("$%.2f USD is $%.2f CAD%n", usd, cad);
	}
	
	public static void example2() {
		Converter myConverter = new Converter();
		
		String currency = "JPY";
		float rate = 155.28f;
		float usd = 10.50f;
		double jpy = myConverter.convert(usd, rate);
		
		System.out.printf("$%.2f USD is ¥%.0f %s%n", usd, jpy, currency);
		
	}

	public static void example3() {
		Words words = new Words();
		String word = "anything";
		words.printLetters(word);
	}
}
