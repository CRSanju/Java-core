package p46HashMap;

import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student(11, "Amith", 87.5);
		Student s2 = new Student(12, "Sumith", 88.5);
		Student s3 = new Student(13, "Rohit", 78.5);
		
		HashMap<Integer, Student> hm = new HashMap<>();
        hm.put(1, s1);
        hm.put(2, s2);
        hm.put(3, s3);
        System.out.println(hm);
        
        
        //To only get the key
        Set<Integer> res1 = hm.keySet();
        Iterator<Integer> itr1 = res1.iterator();
        while(itr1.hasNext()) {
        	System.out.println(itr1.next());
        }
        
        //To only get the value
         Collection<Student> res2 = hm.values();
         Iterator<Student> itr2 = res2.iterator();
         while(itr2.hasNext()) {
        	 System.out.println(itr2.next());
         }
         
         //To get the pair
          Set<Entry<Integer, Student>> res3 = hm.entrySet();
          Iterator<Entry<Integer, Student>> itr3 = res3.iterator();
          while(itr3.hasNext()) {
        	  System.out.println(itr3.next());
          }
        
        
	}

}
