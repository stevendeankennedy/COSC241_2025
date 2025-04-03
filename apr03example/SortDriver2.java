package apr03example;

public class SortDriver2 {

	public static void main(String[] args) {
		SortMachine sort = new SortMachine();
		
		int[] list = sort.getRandomInts(10);
//		int[] list = {5, 2, 6, 1, 3};
//		int[] list = {9,1,8,2,7,6,5};
		sort.insertionSort(list);
		sort.print(list);
		if (sort.isSorted(list))
			System.out.println("It is sorted!");
		else 
			System.out.println("It's not sorted...");
	}

}
