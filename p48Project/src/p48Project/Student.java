package p48Project;

public class Student {
	
	int roll;
	String name;
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return roll + " " + name;
	}
	
	

}
