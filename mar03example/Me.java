package mar03example;

public class Me extends Person {
	private int myNumber;
	private boolean lookinLikeClass;
	
	public Me(int myNumber) {
		super("Me");
		lookinLikeClass = true;
		this.myNumber = myNumber;
	}
	
	private void printNumber() {
		System.out.println(myNumber);
	}
	
	public int getNumber(boolean isScrub) {
		if (isScrub) {
			return -1;
		} else {
			return myNumber;
		}
	}
	
	public String getName() {
		// this is the Me version
		return "I don't want no scrub";
	}
}
