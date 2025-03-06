package mar03example;

public class Scrub extends Guy {

	private boolean isFly;
	
	public Scrub() {
		super(false);
		isFly = false;
	}

	public boolean amIFly() {
		return true; // he thinks he's fly
	}
	
	public boolean isFly() {
		return isFly;
	}
}
