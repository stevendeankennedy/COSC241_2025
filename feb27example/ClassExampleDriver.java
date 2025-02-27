package feb27example;

// Special thanks to Maliyah for singing our theme song!
public class ClassExampleDriver {

	/** Experimenting with Polymorphism! */
	public static void main(String[] args) {
		String[] classes = {"Math", "CS", "Spanish"};
		Student s1 = new Student("Arnold", (byte)12, "Underwater Basketweaving", 
				(short)20, classes);
		Student s2 = new Student("Ash Ketchum", "Pokemon Training");
		Student s3 = new Student("Paul", "English");
		Student[] students = new Student[] {s1, s2, s3};
		Professor prof = new Professor("SteveK", (byte)18, "MWF 1:00");
		Classroom cosc241 = new Classroom(24, students, prof, "Comp Sci");
		
		cosc241.startClass();
		
		Person teacher = cosc241.getProf();
		Person student = s1;
//		System.out.println(teacher);
//		System.out.println(student);
//		Professor p = (Professor)teacher;
//		p.teach();
//		teacher.teach();
		
		
		Person[] people = new Person[3];
		people[0] = prof;
		people[1] = student;
		people[2] = new Person();
		
		for (int i=0; i<people.length; i++) {
			System.out.println(people[i].name);
			System.out.println(people[i]);
		}
		
		
		cosc241.endClass();
	}
	
	public static void mainFromOtherDay(String[] args) {
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
