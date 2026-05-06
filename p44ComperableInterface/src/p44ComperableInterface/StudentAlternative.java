package p44ComperableInterface;

public class StudentAlternative  implements Comparable<StudentAlternative> {

	int roll;
	String name;
	double marks;
	
	public StudentAlternative (int roll, String name, double marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString() {
		return roll + " " + name + " " +  marks;
	}
	
	public int compareTo(StudentAlternative obj) {
	 return this.roll - obj.roll;
	}
}


