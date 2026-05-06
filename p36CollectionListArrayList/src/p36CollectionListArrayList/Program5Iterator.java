package p36CollectionListArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Program5Iterator {

	public static void main(String[] args) {
		
		  ArrayList al = new ArrayList();
			
			al.add(10);
			al.add(20);
			al.add(30);
			al.add(40);
			al.add(50);
			
			Iterator itr = al.iterator();
			
			System.out.print("[");
			while(itr.hasNext()) {
				System.out.print(itr.next());
				if(itr.hasNext() == true) {
					System.out.print(", ");
				}
			}
			System.out.print("]");
 
	}

}
