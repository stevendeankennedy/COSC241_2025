package feb25example;

// Thanks Ashley!
public class Professor extends Person {

	private String officeHours;
	
	public Professor(String name, byte age, String officeHours) {
		this.name = name;
		this.age = age;
		this.officeHours = officeHours;
	}
	
	public void teach() {
		
	}
	
	@Override
	public String toString() {
		return "Professor " + name + " has office hours at " + officeHours;
	}
}
