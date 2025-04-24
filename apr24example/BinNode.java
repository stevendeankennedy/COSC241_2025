package apr24example;

/**
 * Node for Binary Trees
 * 
 * Special thanks to everyone
 */
public class BinNode {
	private String dat;
	private BinNode left;
	private BinNode right;
	
	public BinNode(String dat) {
		this(dat, null, null);
	}
	
	public BinNode(String dat, BinNode left, BinNode right) {
		this.dat = dat;
		this.left = left;
		this.right = right;
	}
	
	
	public String dat() {
		return dat;
	}
	public BinNode left() {
		return left;
	}
	public BinNode right() {
		return right;
	}
	
	void setDat(String dat) {
		this.dat = dat;
	}
	void setLeft(BinNode left) {
		this.left = left;
	}
	void setRight(BinNode right) {
		this.right = right;
	}

}
