package apr17example;

import java.util.Arrays;

/**
 * Implements a dynamic array-based list
 * 
 */

public class Vector {
	// constant for default size
	public static final int MAX_SIZE = 5;
	
	// fields
	private String[] dat;
	private int count;
	
	// constructors
	/**
	 * Main constructor.  Sets up the vector with a size var.
	 * @param size some size
	 */
	public Vector(int size) {
		dat = new String[size];
		count = 0;
	}
	
	public Vector() {
		this(MAX_SIZE);
	}
	
	/**
	 * Put something at the front
	 * @param e
	 */
	public void addFront(String e) {
		insert(e, 0);
	}
	
	/**
	 * Remove the element from the front
	 * @param e
	 */
	public String remFront() {
		return remove(0);
	}
	
	/**
	 * Add an element to the back of the list
	 * @param e
	 */
	public void insertAtBack(String e) {
		insert(e, count);
	}
	
	public String remFromBack() {
		return remove(count-1);
	}
	
	// insert(e, i)
	public void insert(String e, int idx) {
		// defensive programming
		if (idx < 0 || idx > dat.length) {
			System.err.println("Bad index:" + idx);
		} else if (count >= dat.length || idx == dat.length) {
			resize();
		}
		// move all the other elements on the right out of the way
		for (int i = count; i > idx; i-=1) {
			dat[i] = dat[i - 1];
		}
		
		dat[idx] = e;
		count += 1;
	}
	
	/**
	 * We are tryna make a new list, that is bigger and has more room for stuff
	 */
	private void resize() {
		String[] listNew = new String[dat.length * 2];
		//String[] listNew = new String[dat.length + 1];  // the bad way
		
		for(int i = 0; i < dat.length; i+=1) {
			listNew[i] = dat[i]; // Aom fails today!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!111111
		}
		
		dat = listNew;  // this also removes the reference to the old list
				// which is now garbage
	}

	// remove(i)
	public String remove(int idx) {
		// defensive programming
		if (idx < 0 || idx >= count) {
			System.err.println("Bad index, bro:" + idx);
			return null;
		}
		
		String theElement = dat[idx];
		
		// move all the elements after, into the position that opened up (aka left)
		for (int i = idx+1; i < count; i+=1) {
			dat[i-1] = dat[i];
		}
		
		count -= 1;
		
		return theElement;
	}
	
	// get(i) // return that value
	public String get(int i) {
		return dat[i];
	}
	
	/**
	 * Fit the list to the size of the array.  (aka shrink the array) 
	 */
	public void trim() {
		String[] listnew = new String[count];
		
		for (int i=0; i<count; i++) {
			listnew[i] = dat[i];
		}
		
		dat = listnew;
	}
	
	// accessor/mutators
	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Vector [dat=" + Arrays.toString(dat) + ", count=" + count + "]";
	}
}
