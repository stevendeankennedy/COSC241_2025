package apr08example;

public class ListsDriver {

	public static void main(String[] args) {
		runLinkedListTest();
		runStackTest();
		runLLStackTest();
	}

	private static void runLLStackTest() {
		System.out.println("LLStack");
		LLStack stack = new LLStack();
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
		
		list.remFront();
		System.out.println(list);
		list.remFront();
		System.out.println(list);
		
		list.addFront(9);
		System.out.println(list);

	}

}
