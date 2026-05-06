package p49ConcurrentCollections;

import java.util.*;
import java.util.Iterator;

public class Program3 {

public static void main(String[] args) {
		
		ArrayList <Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		 Iterator<Integer> itr = al.iterator();
		 
		while(itr.hasNext()) {
			System.out.println(itr.next());
			al.add(99);
		}
		

	}

}
