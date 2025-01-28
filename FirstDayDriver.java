
public class FirstDayDriver {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.name = "Isaac";
		student1.major = "Computer Science";
		student1.age = 32;
		
		Student student2 = new Student();
		student2.name = "Madison";
		student2.major = "Underwater Basket-weaving";
		student2.age = 32;
		
		Student student3 = new Student();
		student3.name = "Aom";
		student3.major = "Rocket League";
		student3.age = 99;
		
		student1.eat("bacon");
		student2.eat("bananas");
		student1.study("math");
		student2.study("comp sci");
		student3.sleep();
		student3.eat("starbucks");
	}
}
