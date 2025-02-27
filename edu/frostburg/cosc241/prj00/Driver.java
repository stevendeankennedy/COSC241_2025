package edu.frostburg.cosc241.prj00;

public class Driver {

	public static void main(String[] args) {
		startFarm("animal_farm_data.csv");
	}
	
	public static void startFarm(String filename) {
		Farm farm = new Farm(filename);
	}

}
