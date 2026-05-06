package p38CollectionQueue;

import java.util.*;
public class Program1 {

	public static void main(String[] args) {

           Queue q = new LinkedList();
           q.add(10);
           q.add(20);
           q.add(30);
           q.add(40);
           q.add(50);
           System.out.println(q);
           q.remove(20);
           System.out.println(q);
           System.out.println(q.poll());
           System.out.println(q);
           System.out.println(q.peek());
           System.out.println(q);
	}

}
