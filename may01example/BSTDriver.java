package may01example;

import java.util.Random;

public class BSTDriver {

	public static void main(String[] args) {
		// get random tree
		BST bst = getRandomTree(10);
		int sum = bst.ioSum();
		
		bst.printTheActualTree();
		bst.printTreeInorder();
		System.out.printf("The sum of this rando tree is %d%n", sum);
		System.out.printf("Its height is %d%n", bst.getHeight());
	}

	private static BST getRandomTree(int size) {
		BST b = new BST();
		Random r = new Random();
		
		for (int i=0; i<size; i++) {
			int rando = r.nextInt(10);
			b.add(rando);
		}
		
		return b;
	}

}
