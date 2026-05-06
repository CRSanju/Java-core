package p41CollectionTreeSet;

import java.util.TreeSet;

public class Program2 {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();

		ts.add(100);
		ts.add(25);
		ts.add(75);
		ts.add(50);
		ts.add(150);
		ts.add(125);
		ts.add(175);
		ts.add(175);

		System.out.println(ts);

		System.out.println(ts.headSet(75));
		System.out.println(ts.headSet(75,true));
		System.out.println(ts.tailSet(75));
		System.out.println(ts.tailSet(75,false));
		System.out.println(ts.higher(100));
		System.out.println(ts.higher(80));
		System.out.println(ts.ceiling(100));
		System.out.println(ts.ceiling(80));
		System.out.println(ts.lower(100));
		System.out.println(ts.lower(80));
		System.out.println(ts.floor(100));
		System.out.println(ts.floor(80));

	}

}
