package p51ThreadAndMultithreading4;

import java.util.Scanner;

public class Activity extends Thread {
	
	public void run() {
		
		String threadName = Thread.currentThread().getName();
		
		if(threadName.equals("ADD")) {
			addition();
		} else if(threadName.equals("CHAR")) {
			charPrinting();
		} else {
			printNum();
		}
	}
 

	public void addition() {
		System.out.println("Additon activity started: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b  = sc.nextInt();
		
		int res = a + b;
		System.out.println("The addition result is: " + res);
		sc.close();
		System.out.println("Additon activity Completed");
	}
	
	public void charPrinting() {
		System.out.println("Char printing activity started: ");
		for(char ch = 'A'; ch <= 'I'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Char printing activiy Completed");
	}
	
	public void printNum() {
		System.out.println("Printing number activiy started:");
		for(int i  = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing number activity Completed");	
	}
}
