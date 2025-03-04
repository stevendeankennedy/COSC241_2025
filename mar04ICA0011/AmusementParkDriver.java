package mar04ICA0011;

public class AmusementParkDriver {

	public static void main(String[] args) {
		runSimulation();
	}
	
	public static void runSimulation() {
		Attraction[] attr = new Attraction[4];
		Ridable[] ridables = new Ridable[2];
		
		Shop giftShop = new Shop("Space Turkey Gift Shop");
		Shop turkeyLegStand = new Restaurant("Turkey Land");
		
		RollerCoaster supermanCoaster = new RollerCoaster("Superman");
		WaterRide logjammer = new WaterRide("Log Jammer");
		
		attr[0] = giftShop;
		attr[1] = turkeyLegStand;
		attr[2] = supermanCoaster;
		attr[3] = logjammer;
		
		ridables[0] = supermanCoaster;
		ridables[1] = logjammer;
		
		// visit every attraction 
		for(int i=0; i<attr.length; i+=1) {
			attr[i].visit();
			System.out.println(attr[i]); // TODO: remove this line
		}
		
		// ride every ride
		for(int i=0; i<ridables.length; i+=1) {
			ridables[i].ride();
			System.out.println(ridables[i]); // TODO: remove this line
		}
	}

}
