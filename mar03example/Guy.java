package mar03example;

public class Guy extends Person {

	protected boolean hasCar;
	
	public Guy(boolean hasCar) {
		super("Guy");
		this.hasCar = hasCar;
	}
	
	public Person getLove(boolean isScrub, Person me) {
		if (isScrub) {
			return null;
		} else {
			return me;
		}
	}
}
