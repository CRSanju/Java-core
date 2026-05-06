package p43equals;

import java.util.*;

public class MainStudent {

	public static void main(String[] args) {

           Student s1 = new Student(11, "Sanju");
           Student s2 = new Student(12, "Ram");
           Student s3 = new Student(11, "Sanju");
           
           s1.display();
           s2.display();
           s3.display();
           
           System.out.println(s1.equals(s2));
           System.out.println(s1.equals(s3));
           
           //HashSet<Student> hs  = new HashSet<Student>();
           HashSet hs = new HashSet();
           hs.add(s1);
           hs.add(s2);
           hs.add(s3);
           //hs.add(new Student(11, "Sanju"));
           //hs.add(new Student(12, "Ram"));
           
           System.out.println(hs);
	}

}
