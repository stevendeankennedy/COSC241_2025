package mar03example;

public class Person {

	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person";
	}
	
	public String getName() {
		return name;
	}

}
