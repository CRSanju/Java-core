package opps;

public class Mainstudent1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.roll = 18;
		s1.name = "Raja";
		s1.age = 18;
		
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.age);
		
		s1.study();
		s1.sleep();
		
		new Student().study();

	}

}
