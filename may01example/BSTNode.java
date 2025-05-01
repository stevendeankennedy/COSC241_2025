package may01example;

/**
 * Node for Binary Trees
 * 
 * Special thanks to everyone
 */
public class BSTNode {
	private int dat;
	private BSTNode left;
	private BSTNode right;
	
	public BSTNode(int dat) {
		this(dat, null, null);
	}
	
	public BSTNode(int dat, BSTNode left, BSTNode right) {
		this.dat = dat;
		this.left = left;
		this.right = right;
	}
	
	
	public int dat() {
		return dat;
	}
	public BSTNode left() {
		return left;
	}
	public BSTNode right() {
		return right;
	}
	
	void setDat(int dat) {
		this.dat = dat;
	}
	void setLeft(BSTNode left) {
		this.left = left;
	}
	void setRight(BSTNode right) {
		this.right = right;
	}

}
