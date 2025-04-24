package apr24example;

public class BinTreeDriver {

	public static void main(String[] args) {
		runBasicTest();
	}

	private static void runBasicTest() {
		BinTree tree = new BinTree();
		tree.setRoot("banana");
		tree.addLeft(tree.root(), "ladyfinger banana");
		tree.addRight(tree.root(), "blue java banana");
		tree.root().left().setLeft(new BinNode("burro banana"));
		tree.root().left().setRight(new BinNode("plantain"));
		tree.root().left().left().setLeft(new BinNode("manzano"));
		tree.root().left().right().setRight(new BinNode("red banana"));
		tree.root().right().setRight(new BinNode("goldfinger banana"));
		
		// todo: fix this
		tree.setCount(8);
		
		tree.printTreeBFS();
		tree.printTreeDFS(); // TODO: currently, this fails to print manzano
	}

}
