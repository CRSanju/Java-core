package p49ConcurrentCollections;

import java.util.concurrent.CopyOnWriteArrayList;

public class Progam6ForLoop {
	
public static void main(String[] args) {
		
	    CopyOnWriteArrayList <Integer> al = new  CopyOnWriteArrayList<>();
	    
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(int i = 0; i <= al.size() - 1; i++) {
			System.out.println(al.get(i));
			al.add(99);
		}
		
		System.out.println(al);
		
    }

}
