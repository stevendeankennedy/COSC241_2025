package edu.frostburg.cosc241.prj00;

/**
 * Class that holds data for animals.  Abstract, so subclasses have
 * 	to finish the speak method.
 * @author sdkennedy + class
 */
public abstract class Animal { // make sure it says abstract here, thanks Kevin!
	protected String name;
	protected int legs;
	protected String sound;
	protected String food;
	protected int age;
	protected double weight;
	
	public Animal(String name, int legs, String sound, String food, int age, double weight) {
		this.name = name;
		this.legs = legs;
		this.sound = sound;
		this.food = food;
		this.age = age;
		this.weight = weight;
	}

	/** Abstract speak class */
	public abstract void speak();
	
	/* Getters and Setters below */	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
