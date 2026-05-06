package p50ExceptionHandling;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		 System.out.println("Main method excecution has been started");
		 try {
	        divide();
		 } catch(Exception e) {
		      e.printStackTrace();
		 }
	        System.out.println("Main method excecution has been completed");

	}

	//throws an exception the caller and let the caller handle the rest
	public static void divide() throws Exception {
		
		System.out.println("Division started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a = scan.nextInt();
		System.out.println("Enter the value of b : ");
		int b = scan.nextInt();
		
		int res = a/b;
		System.out.println(res);
		scan.close();
	}
}
