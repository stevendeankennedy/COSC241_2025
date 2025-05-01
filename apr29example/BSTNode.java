package apr29example;

/**
 * Node for Binary Trees
 * 
 * Special thanks to everyone
 */
public class BSTNode {
	private String dat;
	private BSTNode left;
	private BSTNode right;
	
	public BSTNode(String dat) {
		this(dat, null, null);
	}
	
	public BSTNode(String dat, BSTNode left, BSTNode right) {
		this.dat = dat;
		this.left = left;
		this.right = right;
	}
	
	
	public String dat() {
		return dat;
	}
	public BSTNode left() {
		return left;
	}
	public BSTNode right() {
		return right;
	}
	
	void setDat(String dat) {
		this.dat = dat;
	}
	void setLeft(BSTNode left) {
		this.left = left;
	}
	void setRight(BSTNode right) {
		this.right = right;
	}

}
