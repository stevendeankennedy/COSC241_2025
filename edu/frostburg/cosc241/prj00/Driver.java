package edu.frostburg.cosc241.prj00;

public class Driver {

	public static void main(String[] args) {
		startFarm("animal_farm_data.csv");
	}
	
	public static void startFarm(String filename) {
		Farm farm = new Farm(filename, 24);  // 24 is the number of rows in the file
	}

}
