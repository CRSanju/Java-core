package p50ExceptionHandling;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		 System.out.println("Main method excecution has been started");
		 try {
	        divide();
		 } catch(Exception e) {
			 //Here the exception is thrown to main method and letting know the caller
			 System.out.println("Exception handled in main method");
		 }
	        System.out.println("Main method excecution has been completed");

		}
		public static void divide() {
			//Here the exception has been handled locally  
			
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
			throw e;
			}

			finally {
			System.out.println("Division Completed");
			}

	   }
	}

