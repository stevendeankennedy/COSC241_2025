package feb25example;

// Special thanks to Maliyah for singing our theme song!
public class ClassExampleDriver {

	public static void main(String[] args) {
		System.out.println("Classroom example");
		
		String[] classes = {"Math", "CS", "Spanish"};
		Student s1 = new Student("Arnold", (byte)12, "Underwater Basketweaving", 
				(short)20, classes);
		
		Student s2 = new Student("Ash Ketchum", "Pokemon Training");
		
		Professor p1 = new Professor("Ashley Gonzalez", (byte)20, "Monday 1-5");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(p1);
		
	}

}
