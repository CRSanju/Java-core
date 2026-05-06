package p51ThreadAndMultithreading3;

import java.util.Scanner;

public class Addition implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Addition activity started :");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a  = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		
		int res = a + b;
		
		System.out.println("Addition res is : "  + res);
		System.out.println("Addition activity completed");
		
		sc.close();
	
	}


}
