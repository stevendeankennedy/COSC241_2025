package apr10example;

public class Stack {
	public static final int MAX_SIZE = 512;
	
	private int[] data;
	private int count;
	
	public Stack() {
		this(MAX_SIZE);
	}
	
	public Stack(int size) {
		data = new int[size];
		count = 0;
	}
	
	public void push(int e) {
		data[count++] = e;
	}
	
	public int pop() {
		return data[--count];
	}
	
	public String toString() {
		String s = "";
		for (int i=0; i<count; i++) {
			s += data[i] + " ";
		}
		return s;
	}
}
