package p36CollectionListArrayList;

import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al.size());
		System.out.println(al.contains(50));
		System.out.println(al.get(2));
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		System.out.println(al.indexOf(20));
		System.out.println(al.isEmpty());
		
		al.remove(1);
		System.out.println(al);
		al.add(20);
		System.out.println(al.indexOf(20));
		System.out.println(al.removeLast());
		System.out.println(al.removeFirst());
		
		al.set(1, "HTML");
		al.add(0, 99);
		
		System.out.println(al);
		
		ArrayList al1 = new ArrayList();
		
		al1.add("Raja");
		al1.add("Rani");
		
		al.addAll(al1);
		System.out.println(al);


	}

}
