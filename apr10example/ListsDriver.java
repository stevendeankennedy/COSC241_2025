package apr10example;

public class ListsDriver {

	public static void main(String[] args) {
//		runLinkedListTest();
//		runStackTest();
//		runLLStackTest();

//		runLLTest1();
//		runLLTest2();
		runLLTest3();
	}

	private static void runLLTest3() {
		// Jackson gets no bonus points, but everyone else except Isaac does.
		LinkedList list = new LinkedList();

		int n = 5;
		for (int i = 0; i < n; i++) {
			list.addFront(i);
		}
		try {
			System.out.println(list);
			int b = list.remBack();
			System.out.println(b + "<-" + list);
			b = list.remBack();
			System.out.println(b + "<-" + list);
			b = list.remBack();
			System.out.println(b + "<-" + list);
			b = list.remBack();
			System.out.println(b + "<-" + list);
			b = list.remBack(); // hmmmmmmmmmm
			System.out.println(b + "<-" + list);
			b = list.remBack();
			System.out.println(b + "<-" + list);
			b = list.remBack();
			System.out.println(b + "<-" + list);
		} catch (IllegalAccessException e) {
			System.err.println("no");
		}
	}

	/**
	 * This will test deleting stuff from the middle
	 */
	private static void runLLTest2() {
		LinkedList list = new LinkedList();

		int n = 5;
		for (int i = 0; i < n; i++) {
			list.addFront(i);
		}

		System.out.println(list);
		try {
//			list.remove(n/2);
//			System.out.println(list);
			list.remove(2);
			System.out.println(list);
			list.remove(1);
			System.out.println(list);
			list.remove(0);
			System.out.println(list);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

	private static void runLLTest1() {
		LinkedList list = new LinkedList();

		System.out.println(list);
		list.addFront(9);
		System.out.println(list);
		try {
			list.remFront();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println(list);
	}

	private static void runLLStackTest() {
		System.out.println("LLStack");
		LLStack stack = new LLStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack);
		try {
			stack.pop();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(stack);
		try {
			stack.pop();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(stack);

		stack.push(9);
		System.out.println(stack);
	}

	private static void runStackTest() {
		System.out.println("Stack");

		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);

		stack.push(9);
		System.out.println(stack);
	}

	private static void runLinkedListTest() {
		System.out.println("LinkedList");

		LinkedList list = new LinkedList();

		list.addFront(1);
		list.addFront(2);
		list.addFront(3);

		System.out.println(list);

		try {
			list.remFront();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);
		try {
			list.remFront();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);

		list.addFront(9);
		System.out.println(list);

	}

}
