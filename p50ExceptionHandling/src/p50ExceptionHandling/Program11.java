package p50ExceptionHandling;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		
		//try block with resource
		try(Scanner scan = new Scanner(System.in))
		{
		System.out.println("Enter the number");
		int a = scan.nextInt();
		System.out.println("The vale of a is :" + a);
		}
	}

}
