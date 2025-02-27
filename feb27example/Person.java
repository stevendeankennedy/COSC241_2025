package feb27example;

// Thanks Chris!
public class Person {

	protected byte age;
	protected String name;
	
	public void eat() {
		System.out.printf("%s eats.%n", name);
	}
	
	public void sleep() {
		System.out.printf("%s sleeps quietly... zzzzz%n", name);
	}
	
	public byte getAge() {
		return age;
	}
	
	public void setAge(byte age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
}
