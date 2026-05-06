package p49ConcurrentCollections;

import java.util.concurrent.CopyOnWriteArrayList;

public class Program4CopyArrayList {

	public static void main(String[] args) {
		
	    CopyOnWriteArrayList <Integer> al = new  CopyOnWriteArrayList<>();
	    
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(Object x: al) {
			System.out.println(x);
			al.add(99);
		}
		
		System.out.println(al);

	}


}
