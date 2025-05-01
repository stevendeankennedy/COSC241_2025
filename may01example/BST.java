package may01example;

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
	
	public void add(int s) {
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
	private void add(int s, BSTNode root) {
		count += 1;
		if (s <= root.dat()) {
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
	
	/**
	 * Returns the sum value of this BST
	 * @return total value of tree
	 */
	public int ioSum() {
		return ioSum(root);
	}
	
	private int ioSum(BSTNode root) {
		if (root == null)
			return 0;
		int sum = 0;
		sum += ioSum(root.left());
		sum += root.dat();
		sum += ioSum(root.right());
		return sum;
	}
	
	public int getHeight() {
		return getHeight(root);
	}
	
	private int getHeight(BSTNode root) {
		if (root == null)
			return -1;
		// get the left height
		int lHeight = getHeight(root.left());
		// get the right height
		int rHeight = getHeight(root.right());
		
		// compare heights
		//	myHeight = greater(lHeight, rHeight) + 1
		int myHeight = 0;
		if (lHeight > rHeight) {
			myHeight = lHeight + 1;
		} else {
			myHeight = rHeight + 1;
		}
		return myHeight;
	}
	
	public void printTheActualTree() {
		printTheActualTree(root);
	}
	
	private void printTheActualTree(BSTNode root) {
		if (root == null)
			return; // no print
		
		printTheActualTree(root.left());
		// Visit ------------------ 
		int H = getHeight(root);
		String spacer = "";
		// print H number of spaces
		for (int i=0; i<H; i++) {
			spacer += " ";
		}
		System.out.print(spacer);
		// print root
		System.out.print(root.dat());
		// print H number of spaces
		System.out.println(spacer);
		// Visit END----------------
		printTheActualTree(root.right());
	}
	
}
