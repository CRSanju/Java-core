package p50ExceptionHandling;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
        System.out.println("Main method excecution has been started");
        divide();
        System.out.println("Main method excecution has been completed");

	}
	public static void divide() {
		//Here the exception has been handled locally without knowing the main method
		
		try{
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
		catch (Exception e)
		{
		System.out.println("Exception handled in divide method");
		}

		System.out.println("Division Completed");

		}
	}
	

