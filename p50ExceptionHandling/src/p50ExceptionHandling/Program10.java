package p50ExceptionHandling;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
		System.out.println("Enter the number");
		int a = scan.nextInt();
		System.out.println("The value of a is " + a);
		
		}catch(Exception e) {
			System.out.println("Exception handled");
		}finally {
			scan.close();
		}

		
	}

}
