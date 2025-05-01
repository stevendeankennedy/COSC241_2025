package apr29example;

import java.util.LinkedList;

/**
 * Binary Tree Class
 * 
 * Special thanks
 */

public class BST {
	private BSTNode root;
	private int count;
	
	public BST() {
		root = null;
		count = 0;
	}
	
//	// WARNING: THIS IS TEMP, DELETE THIS NEXT WEEK
//	void setCount(int n) {
//		count = n;
//	}
//	/**
//	 * Set the root value.
//	 * @param value
//	 */
//	void setRoot(String value) {
//		// make the node and make it the root
//		if (count != 0) {
//			System.err.println("There's already a root, can't add...");
//			return;
//		}
//		
//		root = new BSTNode(value);
//		count += 1;
//	}
//	
//	BSTNode root() {
//		return root;
//	}

	
//	/**
//	 * Add a node to the left.
//	 * @param root
//	 * @param value
//	 */
//	public void addLeft(BSTNode root, String value) {
//		if (root == null || root.left() != null) {
//			System.err.println("Sorry, can't add left...");
//			return;
//		}
//		
//		root.setLeft(new BSTNode(value));
//		count += 1;
//	}
//	
//	public void addRight(BSTNode root, String value) {
//		if (root == null || root.right() != null) {
//			System.err.println("Sorry, can't add right...");
//			return;
//		}
//		
//		root.setRight(new BSTNode(value));
//		count += 1;
//	}
	
	public void add(String s) {
		if (count == 0) {
			count += 1;
			root = new BSTNode(s);
			return;
		}
		
		add(s, root);
	}
	
	/**
	 * Add a new value.
	 * 	Special thanks to Ashley, Isaac (clean your hat)!
	 * @param s
	 * @param root
	 */
	private void add(String s, BSTNode root) {
		count += 1;
//		if (s <= root.dat()) {  // <- can't do this way, sadly
		if (s.compareTo(root.dat()) <= 0) {
			if (root.left() == null) {
				root.setLeft(new BSTNode(s));
			} else // there IS a left child already
				add(s, root.left());
		} else { // aka s > root.dat (aka go right)
			if (root.right() == null) {
				root.setRight(new BSTNode(s));
			} else {
				add(s, root.right());
			}
		}
	}
	
	public void printTreeBFS() {
		// visit the root
		// enqueue all children
		// visit <- dequeue, repeating from there
		LinkedList<BSTNode> q = new LinkedList<>();
		printTreeBFS(root, q, count);
	}
	
	private void printTreeBFS(BSTNode root, LinkedList<BSTNode> q, int n) {
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
		LinkedList<BSTNode> stack = new LinkedList<>();
		printTreeDFS(root, stack, count);
	}
	
	private void printTreeDFS(BSTNode root, LinkedList<BSTNode> stack, int n) {
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
	
	/**
	 * Print it in preorder
	 * 	Special thanks to Maliyah!
	 */
	public void printTreePreorder() {
		// VLR
		printTreePreorder(root);
		System.out.println();
	}
	
	private void printTreePreorder(BSTNode root) {
		if (root == null)
			return;
		System.out.print(root.dat() + " ");
		printTreePreorder(root.left());
		printTreePreorder(root.right());
	}
	
	/**
	 * Print tree in order.
	 * 	Special thanks to Jackson (+ esp Kevin)!
	 */
	public void printTreeInorder() {
		// LVR
		printTreeInorder(root);
		System.out.println();
	}
	
	private void printTreeInorder(BSTNode root) {
		if (root == null)
			return;
		// Left
		printTreeInorder(root.left());
		// Visit
		System.out.print(root.dat() + " ");
		// Right
		printTreeInorder(root.right());
	}
	
	/**
	 * Print in postorder
	 * 	Special thanks, Wes!
	 */
	public void printTreePostorder() {
		// LRV
		printTreePostorder(root);
		System.out.println();
	}
	
	private void printTreePostorder(BSTNode root) {
		if (root == null)
			return;
		printTreePostorder(root.left());
		printTreePostorder(root.right());
		System.out.print(root.dat() + " ");
	}
}
