package p44ComperableInterface;

public class Student implements Comparable<Student> {

	int roll;
	String name;
	double marks;
	
	public Student(int roll, String name, double marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString() {
		return roll + " " + name + " " +  marks;
	}
	
	public int compareTo(Student obj) {
		if(this.roll > obj.roll) {
			return 1;
		} else if(this.roll < obj.roll) {
			return -1;
		} else {
			return 0;
		}
	}
}
