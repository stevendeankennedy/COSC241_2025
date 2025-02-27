package feb27example;

// Thanks Ashley!
public class Professor extends Person {

	private String officeHours;

	public Professor(String name, byte age, String officeHours) {
		this.name = name;
		this.age = age;
		this.officeHours = officeHours;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public void teach() {
		System.out.printf("Professor %s begins to teach!%n", name);
	}

	@Override
	public String toString() {
		return "Professor " + name + " has office hours at " + officeHours;
	}
}
