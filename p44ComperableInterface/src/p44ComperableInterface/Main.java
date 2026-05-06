package p44ComperableInterface;

import java.util.*;
public class Main {

	public static void main(String[] args) {
	
		Student s1 = new Student(11, "Amith", 80.5);
		Student s2 = new Student(13, "Rohit", 70.5);
		Student s3 = new Student(12, "Mohit", 60.5);
		
		ArrayList<Student> al = new ArrayList<>();
		
        al.add(s1);
        al.add(s2);
        al.add(s3);
        System.out.println(al);
        
        Collections.sort(al);
        System.out.println(al);
	}

}
