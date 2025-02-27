package edu.frostburg.cosc241.prj00;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Farm {
	private Animal[] animals;
	
	public Farm(String filename) {
		// Read the file, make the animal array, and fill it with the animals
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
//				System.out.println(data[0]);
				
				// TODO: FINISH THIS YOURSELVES HAHAHAHAHAHAH TOO BAD
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}
}
