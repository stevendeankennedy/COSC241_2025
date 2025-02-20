package feb20example;

public class ArrayExample {

	/**
	 * Create an array of some size n.
	 * 	Fille it with a count of ints from 1 to n
	 * @param size the size
	 * @return
	 */
	public int[] makeArray(int size) {
		int[] myArray = new int[size];
		
		for(int i = 0; i < myArray.length; i+=1) {
			myArray[i] = i+1;
		}
		
		return myArray;
	}
	
	/**
	 * Create a 2d n x n sized array and fill with nums
	 * @param size
	 * @return
	 */
	public int[][] make2DArray(int size) {
		int[][] myData = new int[size][size];
		int count = 1;
		
		for(int i=0; i<myData.length; i+=1) {  // x 
			for(int j=0; j<myData.length; j+=1) { // y
				myData[i][j] = count;
				count += 1;
			}
		}
		
		return myData;
	}
	
	public String[] getWords() {
		String[] strings = {"first", "second", "third"};
		
		return strings;
	}
	
	public void arrayExampleStuff() {
		int[] arr = {2, 4, 8, 16, 32, 64};
		
		for (int i=0; i<=arr.length; i+=1) { // causes exception
			System.out.print(i + "->");
			System.out.println(arr[i]);
		}
	}
}
