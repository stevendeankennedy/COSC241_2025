package apr01example;

public class SortDriver {

	public static void main(String[] args) {
		SortMachine sort = new SortMachine();
		CountingMachine count = new CountingMachine();
		
		// int[] list = {4, 2, 7, 3, 9, 13};
		int[] list = sort.getRandomInts(10);
		
		sort.bubbleSort(list);
		
		int n = 10;
		
		System.out.printf("Using n=%d:%n", n);
		System.out.println(count.constant(n));
		System.out.println(count.linear(n));
		System.out.println(count.quadratic(n));
		System.out.println(count.cubic(n));
		System.out.println(count.log2(n));

	}

}
