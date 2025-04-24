package apr24example;

import java.util.LinkedList;

/**
 * Binary Tree Class
 * 
 * Special thanks to Ellie, Ashley, Chris, et al
 */

public class BinTree {
	private BinNode root;
	private int count;
	
	public BinTree() {
		root = null;
		count = 0;
	}
	
	// WARNING: THIS IS TEMP, DELETE THIS NEXT WEEK
	void setCount(int n) {
		count = n;
	}
	/**
	 * Set the root value.
	 * @param value
	 */
	void setRoot(String value) {
		// make the node and make it the root
		if (count != 0) {
			System.err.println("There's already a root, can't add...");
			return;
		}
		
		root = new BinNode(value);
		count += 1;
	}
	
	BinNode root() {
		return root;
	}

	
	/**
	 * Add a node to the left.
	 * @param root
	 * @param value
	 */
	public void addLeft(BinNode root, String value) {
		if (root == null || root.left() != null) {
			System.err.println("Sorry, can't add left...");
			return;
		}
		
		root.setLeft(new BinNode(value));
		count += 1;
	}
	
	public void addRight(BinNode root, String value) {
		if (root == null || root.right() != null) {
			System.err.println("Sorry, can't add right...");
			return;
		}
		
		root.setRight(new BinNode(value));
		count += 1;
	}
	
	public void printTreeBFS() {
		// visit the root
		// enqueue all children
		// visit <- dequeue, repeating from there
		LinkedList<BinNode> q = new LinkedList<>();
		printTreeBFS(root, q, count);
	}
	
	private void printTreeBFS(BinNode root, LinkedList<BinNode> q, int n) {
		if (--n == 0) {
			System.out.println("-");
			return;
		}
		System.out.print(root.dat() + ",");
		if (root.left() != null)
			q.addLast(root.left());
		if (root.right() != null)
			q.addLast(root.right());
		printTreeBFS(q.removeFirst(), q, n);
	}
	
	public void printTreeDFS() {
		// visit the root
		// enqueue all children (using a stack)
		// visit <- pop, repeating from there
		LinkedList<BinNode> stack = new LinkedList<>();
		printTreeDFS(root, stack, count);
	}
	
	private void printTreeDFS(BinNode root, LinkedList<BinNode> stack, int n) {
		if (--n == 0) {
			System.out.println("-");
			return;
		}
		System.out.print(root.dat() + ",");
		if (root.left() != null)
			stack.addLast(root.left());
		if (root.right() != null)
			stack.addLast(root.right());
		printTreeDFS(stack.removeLast(), stack, n);
	}
	
	public void printTreePreorder() {
		
	}
	
	public void printTreeInorder() {
		
	}
	
	public void printTreePostorder() {
		
	}
}
