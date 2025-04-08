package apr08example;

public class LinkedList {
	private Node head;
	private Node tail;
	private int count;
	
	// constructor
	public LinkedList() {
		head = null;
		tail = null;
		count = 0;
	}
	
	// addFront
	public void addFront(int e) {
		if (count == 0) { // list is empty
			Node nd = new Node(e, head);
			head = nd;
			tail = nd;
		} else {
			Node nd = new Node(e, head);
			head = nd;
			// don't change the tail
		}
		
		count += 1;
	}
	
	// remFront TODO: This is next
	public int remFront() {
		Node r = head;
		head = head.next();
		count -= 1;
		return r.data();
	}
	
	public String toString() {		
		Node current = head;
		String s = "";
		while (current != null) {
			s += current.data() + " ";
			current = current.next();
		}
		return s;
	}
}
