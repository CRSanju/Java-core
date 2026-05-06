
package p36CollectionListArrayList;

import java.util.ArrayList;

public class Program4 {

	public static void main(String[] args) {
		
		  ArrayList al = new ArrayList();
			
			al.add(10);
			al.add(20);
			al.add(30);
			al.add(40);
			al.add(50);
			
			System.out.print("[");
			for(int i = 0; i <= al.size()-1; i++) {
				if(i != al.size() - 1) {
				System.out.print(al.get(i) + ", ");
				} else {
					System.out.print(al.get(i));
				}
			}
			System.out.print("]");


	}

}
