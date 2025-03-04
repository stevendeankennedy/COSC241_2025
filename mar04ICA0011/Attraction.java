package mar04ICA0011;

public abstract class Attraction {

	protected String name;
	protected boolean isOpen;
	
	public Attraction(String name) {
		this.name = name;
		isOpen = true;
	}
	
	public Attraction(String name, boolean isOpen) {
		this.name = name;
		this.isOpen = isOpen;
		// pro tip: constructors always implicitly 
		//	return this new object it made
	}
	
	public abstract void visit();
	
	@Override
	public String toString() {
		if (isOpen) {
			return name + " is open!";
		}
		return name + " is closed...";
	}
}
