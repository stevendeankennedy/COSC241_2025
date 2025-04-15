package apr10example;

/**
 * special thanks to lots of people, EXCEPT AOM AND WES AND SHAWN!!!!!!
 * I mean, Shawn isn't even paying attention right now.  We should play a prank
 * 	on him.
 */
public class LinkedList {
	private Node head;
	private Node tail;
	private int count;
	
	public int getCount() {
		return count;
	}

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
	
	// remFront 
	public int remFront() throws IllegalAccessException {
		if (count == 0) {
			// do it differently
			System.err.println("I mean, there's nothing in the list, bro...");
			throw new IllegalAccessException();
		} else { // aka, we have stuff in the list
			Node r = head;
			head = head.next();
			count -= 1;
			return r.data();
		}
	}
	
	public int remove(int i) throws IllegalAccessException {
		if (i >= count) {
			throw new IllegalAccessException();
		}
		if (i <= 0) {
			return remFront();
		}
		// there are a few elements in the list, so returning is easier
		// find the node
		
		Node prev = head;
		int idx = 0;
		while (idx < i - 1) {
			prev = prev.next();
			idx += 1;
		} // once the loop ends, we are pointing at the PREV node
		// PREV -> I -> I.next()
		// make the temp node
		Node r = prev.next();
		// adjust the references
		prev.setNext(r.next());
		// prev.setNext(prev.next().next()); // <-- also possible...
		count -= 1;
		return r.data();
	}
	
	public int remBack() throws IllegalAccessException {
		if (count <= 1) {
			return remFront();
		}
		Node r = tail;
		Node curr = head;
		int i = 0;
		while(i < (count - 2)) {
			curr = curr.next();
			i += 1;
		}
		curr.setNext(null);
		tail = curr;
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
		return s + ":" + count;
	}
}
