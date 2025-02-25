package feb25example;

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
		
	}
	
	
	public void study() {
		
	}
	
	// break out in song!
	public void sing() {
		
	}
	
	public void talkTo(Student other) {
		
	}
	
	@Override
	public String toString() {
		return name + " is a " + major + " major";
	}
}
