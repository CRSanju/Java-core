package p39CollectionArraydeque;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		
		 ArrayDeque q = new ArrayDeque();
         q.add(10);
         q.add(20);
         q.add(30);
         
         q.addFirst(40);
         System.out.println(q);
         q.addLast(99);
         System.out.println(q);
         System.out.println(q.remove());
         System.out.println(q.removeLast());
         System.out.println(q.removeLast());
         System.out.println(q);
         System.out.println(q.poll());
         System.out.println(q);
         System.out.println(q.pollLast());
         System.out.println(q);
	}

}
