package apr17example;

public class VectorDriver {

	public static void main(String[] args) {
//		test01();
//		test02();
		
		testQueueStuff();
		testStackStuff();

	}

	private static void testQueueStuff() {
		System.out.println("Queue!");
		Vector Q = new Vector();
		
		Q.insertAtBack("Kevin");
		Q.insertAtBack("Bob");
		Q.insertAtBack("Stuart");
		Q.insertAtBack("Otto");
		
		System.out.println(Q);
		Q.remFront();
		// List should contain: Bob, Stuart, Otto
		System.out.println(Q);
	}

	private static void testStackStuff() {
		System.out.println("Stack!");
		Vector S = new Vector();
		
		S.insertAtBack("Blue Eyes White Dragon");
		S.insertAtBack("Exodius");
		S.insertAtBack("Pot of Greed");
		S.insertAtBack("S:P Little Knight");
		System.out.println(S);
		System.out.printf("You draw a %s!  You win, nerd!%n", S.remFromBack());
	}

	private static void test02() {
		Vector list = new Vector(5);
		list.insert("a", 0);
		list.insert("b", 1);
		list.insert("c", 2);
		list.insert("d", 3);
		list.insert("e", 4);
		
		System.out.println(list.remove(5));
		System.out.println(list.remove(4));
		System.out.println(list.remove(0));
//		list.insert("x", 3);
//		list.insert("y", 4);
		
		list.trim();
	}

	private static void test01() {
		Vector list = new Vector(4);
		
		list.insert("a", 0);
		list.insert("b", 1);
		list.insert("c", 2);
		System.out.println(list);
		
		list.insert("Rust", 2);
		System.out.println(list);
		
		list.insert("Ark Evolved", 2);
		list.insert("Palworld", 0);
		list.insert("V Rising", 1);
		list.insert("Minecraft", 0);
		list.insert("Skyrim", 0);
		System.out.println(list);
		
		list.remove(7);
		list.remove(0);
	}

}
