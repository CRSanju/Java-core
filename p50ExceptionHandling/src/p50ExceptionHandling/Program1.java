package p50ExceptionHandling;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Connection established");
        try {
        	System.out.println("Enter the value of a: ");
        	int a = scan.nextInt();
        	
        	System.out.println("Enter the value of b: ");
        	int b = scan.nextInt();
        	
        	int result = a/b;
        	System.out.println(result);
        } catch(Exception e) {
        	System.out.println("Exception has been handled");
        }
        
        System.out.println("Connection terminated");

        scan.close();
	}

}
