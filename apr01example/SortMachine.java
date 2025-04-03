package apr01example;

import java.util.Random;

/**
 * Show off some sorts with algorithm analysis
 * 
 * Special thanks to Maliyah, Jackson, Wes, Chris, Kevin, ...
 */
public class SortMachine {

	public void insertionSort(int[] list) {
		
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
}
