package edu.frostburg.cosc241.prj00;

public class FourLeggedAnimal extends Animal {

	public FourLeggedAnimal(String name, String type, String sound, String food, int age, double weight) {
		super(name, type, 4, sound, food, age, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		System.out.printf("%s!  Four legs good.%n", sound);
	}

}
