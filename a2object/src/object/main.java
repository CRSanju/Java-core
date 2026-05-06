package object;

public class main {
	
	public static void main(String[] args) {
    student s1 = new student();
    
    s1.rollNumber = 13;
    s1.name = "Sanju";
    s1.marks = 99;
    
    System.out.println(s1.rollNumber);
    System.out.println(s1.name);
    System.out.println(s1.marks);
    
    s1.study();
    s1.sleep();
    
	}
}
