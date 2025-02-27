package feb27example;

public class Classroom {
	
	// fields (state)	
	private int capacity;
	private Student[] students;
	private Professor prof;
	private String subject;
	
	
	public Classroom(int capacity, Student[] students, Professor prof, String subject) {
		this.capacity = capacity;
		this.students = students;
		this.prof = prof;
		this.subject = subject;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public Professor getProf() {
		return prof;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	/* ---------------------------- */
	// methods (behavior)
	public void startClass() {
		System.out.println("--> Class begins!");
	}
	
	public void endClass() {
		System.out.println("--> Class ends!");
	}
	
	public void fireDrill() {
		
	}
}
