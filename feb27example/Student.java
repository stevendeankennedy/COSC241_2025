package feb27example;

// Thanks Shaun!
public class Student extends Person {

	private String major;
	private short credits;
	private String[] classes; // classes taking this semester
	
	public Student(String name, String major) {
		this(name, (byte)0, major, (short)0, null);
	}
	
	public Student(String name, byte age, String major, short credits, String[] classes) {
		System.out.println("Make a student!");
		this.name = name;
		this.age = age;
		this.major = major;
		this.credits = credits;
		this.classes = classes;
	}
	
	public void sleepInClass() {
		System.out.printf("%s sleeps in class%n", name);
	}
	
	
	public void study() {
		System.out.printf("%s begins to study for %s%n", name, major);
	}
	
	// break out in song!
	public void sing() {
		System.out.printf("%s begins to sing!  Maliyah leads!%n", name);
	}
	
	public void talkTo(Student other) {
		System.out.printf("%s talks to %s.  Hi there!%n", this.name, other.name);
	}
	
	// Accessors and Modifiers
	// aka "getters" and "setters"
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public short getCredits() {
		return credits;
	}
	
	public void setCredits(short credits) {
		this.credits = credits;
	}
	
	public String[] getClasses() {
		return classes;
	}
	
	public void setClasses(String[] classes) {
		this.classes = classes;
	}
	
	
	@Override
	public String toString() {
		return name + " is a " + major + " major";
	}
}
