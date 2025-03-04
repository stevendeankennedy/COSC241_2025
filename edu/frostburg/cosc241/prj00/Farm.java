package edu.frostburg.cosc241.prj00;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Farm {
	private Animal[] animals;
	
	public Farm(String filename, int size) {
		// Read the file, make the animal array, and fill it with the animals
		animals = new Animal[size];
		readFile(filename);
		// TODO: Make sure animals read into the array properly
	}
	
	/*
	 * TODO: implement these methods
		readFile
		printAnimals
		makeNoise
	*/
	
	private void readFile(String filename) {
		File file = new File(filename);
		Scanner s;
		try {
			s = new Scanner(file);
			
			while(s.hasNextLine()) {
				String line = s.nextLine();
//				System.out.println(line);
				String[] data = line.split(",");
				System.out.printf("%s has %s legs%n", data[0], data[2]);
				
				// take the string version of legs, parse(change it) into an int
				String name = data[0];
				String type = data[1];
				int legs = Integer.parseInt(data[2]);
				String sound = data[3];
				String food = data[4];
				int age = Integer.parseInt(data[5]);
				double weight = Double.parseDouble(data[6]);
				Animal a;
				if (legs == 2) {
					a = new TwoLeggedAnimal(name, type, sound, food, age, weight);
				} else {
					// TODO: Now you can finish this...
				}
				
				// TODO: FINISH THIS YOURSELVES HAHAHAHAHAHAH TOO BAD
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}
}
