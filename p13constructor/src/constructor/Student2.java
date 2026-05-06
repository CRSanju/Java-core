package constructor;

public class Student2 {
int roll;
String name;

public Student2 (int roll, String name) {
	this.roll = roll;
	this.name = name;
}

public Student2(Student2 second) {
	this.roll = second.roll;
	this.name = second.name;
}

void disp() {
	System.out.println(roll);
	System.out.println(name);
}
}
