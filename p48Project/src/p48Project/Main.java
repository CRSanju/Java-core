package p48Project;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student> classA = new ArrayList<>();
		ArrayList<Student> classB = new ArrayList<>(); 
		ArrayList<Student> classC = new ArrayList<>();
		
		Student s1 = new Student(1, "Ajay");
		Student s2 = new Student(2, "Amith");
		Student s3 = new Student(3, "Arjun");
		
		classA.add(s1);
		classB.add(s2);
		classC.add(s3);
		
		Student s4 = new Student(4, "Bob");
		Student s5 = new Student(5, "Charan");
		Student s6 = new Student(6, "Anu");
		
		classA.add(s4);
		classB.add(s5);
		classC.add(s6);
		
		Student s7 = new Student(7, "Deepak");
		Student s8 = new Student(8, "Mani");
		Student s9 = new Student(9, "Babblu");
		
		classA.add(s7);
		classB.add(s8);
		classC.add(s9);
		
		
		HashMap<String, List<Student>> map = new HashMap<>();
		
		map.put("ClassA", classA);
		map.put("ClassB", classB);
		map.put("ClassC", classC);
		
		//To print ClassB  details
		System.out.println("ClassB -> " + map.get("ClassB"));
		
		System.out.println();
		
		//To print all
		for(Map.Entry<String, List<Student>> x: map.entrySet()) {
			System.out.println(x.getKey() + " -> " + x.getValue());
		}
	}

}
