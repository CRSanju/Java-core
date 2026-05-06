package p45ComparatorInterface;

public class Student {


	int roll;
	String name;
	double marks;
	
	public Student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return  roll + " " +  name + " " + marks;
	}
	
	
}
