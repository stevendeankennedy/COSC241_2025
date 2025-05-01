package apr29example;

public class BSTDriver {

	public static void main(String[] args) {
		runBasicTest();
	}

	private static void runBasicTest() {
		BST tree = new BST();
		
		tree.add("K");
		tree.add("I");
		tree.add("D");
		tree.add("C");
		tree.add("U");
		tree.add("D");
		tree.add("Y");
		tree.add("R");
		tree.add("A");
		tree.add("G");
		tree.add("E");

		System.out.print("inorder: ");
		tree.printTreeInorder();
		System.out.print("preorder: ");
		tree.printTreePreorder();
		System.out.print("postorder: ");
		tree.printTreePostorder();
	}

}
