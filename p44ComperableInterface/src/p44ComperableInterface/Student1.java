package p44ComperableInterface;

public class Student1 {
	
	int roll;
	String name;
	double marks;
	public Student1(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student1 [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	//Generate using ecplise. just go to source and then generate.

}
