package apr01example;

/**
 * Thanks Madison, Ellie, Ashley
 */

public class CountingMachine {

	public int constant(int n) {	
		return 1;
	}
	
	public int linear(int n) {
		int count = 0;
		
		for(int i=0; i<n; i++)
			count++;
		
		return count;
	}
	
	public int quadratic(int n) {
		int count = 0;
		
		for (int i=0; i<n; i++) {
			for( int j=0; j<n; j++) {
				count++;
			}
		}
		
		return count;
	}
	
	public int cubic(int n) {
		int count = 0;
		
		for (int i=0; i<n; i++)
			for (int j=0; j<n; j++)
				for (int k=0; k<n; k++)
					count++;
		
		return count;
	}
	
	public int log2(int n) {
		int count = -1;
		
		for (int i=n; i>0; i/=2)
			count++;
		
		return count;
	}
}
