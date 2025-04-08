package apr03example;

import java.util.Random;

/**
 * Show off some sorts with algorithm analysis
 * 
 * Special thanks to Maliyah, Jackson, Wes, Chris, Kevin, ...
 */
public class SortMachine {

	// TODO: Tuesday...
	public void quickSort(int[] list) {
		// pick a partition value, p
		//	best idea is Median of 3...
		// for every element smaller than p,
		//	push it to the left of p
		// do it again...
	}
	
	private int medianOf3(int[] list, int L, int R) {
		// pick first, middle, and last
		// return the median value
		return -1;
	}
	
	private int firstElemPartition(int[] list, int L, int R) {
		return L;
	}
	
	/**
	 * Insertion sort implementation
	 * @param list
	 */
	public void insertionSort(int[] list) {
		// for every element in the list
		for (int i=1; i<list.length; i+=1) {
			// 	from elem 1 to the end of the list
			//		while there are elems to the left
			int current = i;
			while (current > 0 && (list[current] < list[current-1])) {
				swap(list, current, current-1);
				current -= 1;
			}

			//		insert the current element
			//		a.k.a. move it left as long as it is smaller than the left elem
		}
	}
	
	public void bubbleSort(int[] list) {	
		// do this 1 time for every possible bubble
		for (int i=0; i<list.length; i+=1) { // O(n) <- 1 for each element
			// make a bubble, and move it through the list
			for (int b=1; b<list.length; b+=1) { // O(n-1) <- 1 for each element, almost
				// compare and maybe swap
				if (list[b-1] > list[b]) { // O(1)
					swap(list, b-1, b); // swap:O(1) + O(1) + O(1)
				}
			}
		}
	}
	
	public void swap(int[] list, int l, int r) {
		int temp = list[l];  // O(1)
		list[l] = list[r];	 // O(1)
		list[r] = temp;		 // O(1)
	}
	
	public int[] getRandomInts(int size) {
		int[] list = new int[size];
		
		Random R = new Random();
		
		for (int i=0; i<size; i+=1) {
			list[i] = R.nextInt(100);
		}
		
		return list;
	}
	
	public boolean isSorted(int[] list) {
		for (int i=0; i<list.length-1; i+=1) {
			if (list[i+1] < list[i])
				return false;
		}
		return true;
	}
	
	public void print(int[] list) {
		for (int i=0; i<list.length; i++)
			System.out.print(list[i] + " ");
		System.out.println();
	}
}
