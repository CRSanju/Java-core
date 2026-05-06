package random;

import java.util.Scanner;

public class SuperPrime {

	public static void main(String[] args) {
	/*	
		int n = 1;
		if (n == 1) {
			n++;
		}
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		
		if(count == 2) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is not prime");
		}
*/
		
		
		/*
		int n = 13;
		boolean isPrime = true;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
		System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a start number");
		int start = scan.nextInt();
		System.out.println("Enter an end number");
		int end = scan.nextInt();
		
		for (int i = start; i <= end; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				System.out.println(i);
			}
		}
	}

}
