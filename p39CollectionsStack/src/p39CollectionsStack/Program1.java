package p39CollectionsStack;

import java.util.ArrayDeque;

public class Program1 {

	public static void main(String[] args) {
		
		 ArrayDeque q = new ArrayDeque();
         q.push(10);
         q.push(20);
         q.push(30);
         q.push(40);
         q.push(50);
         
         System.out.println(q);
         System.out.println(q.pop());
         System.out.println(q);

	}

}
