package apr08example;

public class LLStack {
	private LinkedList data;
	private int count;
	
	public LLStack() {
		data = new LinkedList();
		count = 0;
	}
	
	public void push(int e) {
		data.addFront(e);
		count += 1;
	}
	
	public int pop() {
		count -= 1;
		return data.remFront();
	}
	
	public String toString() {
		return data.toString();
	}
}
