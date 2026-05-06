package p49ConcurrentCollections;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		
		ArrayList <Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(Object x: al) {
			System.out.println(x);
			al.add(99);
		}

	}

}
