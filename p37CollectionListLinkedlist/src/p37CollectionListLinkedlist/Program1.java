package p37CollectionListLinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Program1 {

	public static void main(String[] args) {

       LinkedList al = new LinkedList();
       
       al.add(100);
       al.add(50);
       al.add(150);
       al.add(25);
       al.add(125);
       al.add(75);
       al.add(175);
       al.add(150);
       
       System.out.println(al);
       
       /*
       for(Object x: al) {
			System.out.print(x + " ");
		}
       */
       
       Iterator itr = al.iterator();
       
       while(itr.hasNext()) {
    	   System.out.print(itr.next() + " ");
       }
	}

}
