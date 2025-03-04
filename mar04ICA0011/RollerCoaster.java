package mar04ICA0011;

public class RollerCoaster extends Attraction implements Ridable {

	public RollerCoaster(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ride() {
		System.out.printf("Let's ride the %s now!%n", name);
	}

	@Override
	public void visit() {
		// TODO Auto-generated method stub
		
	}

}
