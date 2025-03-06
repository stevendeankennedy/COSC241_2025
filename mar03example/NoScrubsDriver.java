package mar03example;

public class NoScrubsDriver {

	public static void main(String[] args) {
		noScrubs();
	}

	public static void noScrubs() {
		Scrub scrub = new Scrub();
		Person me = new Me(123456);
		Me me2 = new Me(4444444);
		Person you = new Person("You");
	
//		me.getNumber(); // error
//		me2.getNumber(false); // no error
		
		boolean isfly = scrub.amIFly();
		Person lover = scrub.getLove(!scrub.isFly(), me);
		
		System.out.printf("Fly?%b!  Got love?%s%n", scrub.isFly(), lover);
		
		// polymorphism example
		System.out.println(scrub.getName()); // scrub is type Scrub
		System.out.println(me.getName()); // me is type Me (but in a Person var)
		System.out.println(me2.getName());
		System.out.println(you.getName());
	}
}
