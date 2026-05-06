package p49ConcurrentCollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Program5UsingIterator {

public static void main(String[] args) {
		
	    CopyOnWriteArrayList <Integer> al = new  CopyOnWriteArrayList<>();
	    
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
		
		System.out.println(al);
		
     }
}
