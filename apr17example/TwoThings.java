package apr17example;

public class TwoThings<T> {
	T first;
	T second;
	
	T[] list;
	
	public TwoThings(T first, T second) {
		this.first = first;
		this.second = second;
//		list = (T[]) new Object[6];
	}
	
	public static void main(String[] args) {
		TwoThings<Integer> two = new TwoThings<>(5, 6);
		TwoThings<String> oth = new TwoThings<>("a", "b");
		
		System.out.println(two.first);
		System.out.println(two.second);
		System.out.println(oth.first);
	}
}
