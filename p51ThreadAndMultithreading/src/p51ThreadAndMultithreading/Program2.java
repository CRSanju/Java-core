package p51ThreadAndMultithreading;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	     
	     System.out.println("Enter the number: ");
	     int num = scan.nextInt();
	     System.out.println("Entered number is : " + num);
	     
	     System.out.println("Enter the first number : ");
	     int a = scan.nextInt();
	     System.out.println("Enter the second number : ");
	     int b = scan.nextInt();
	     int res = a+b;
	     System.out.println("Addition result is : " + res);

	     scan.close();
	}

}
