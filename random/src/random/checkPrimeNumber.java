package random;

import java.util.Scanner;

public class checkPrimeNumber {

		    public static void main(String[] args) {
		    	Scanner scan = new Scanner(System.in);
		    	System.out.println("Enter a number");
		    	 int num = scan.nextInt();
		         boolean isPrime = true; //default
		         for (int i=2; i<=Math.sqrt(num); i++) {
		             if (num % i == 0) {
		                 isPrime = false;
		                 break;
		             }
		         }
		         if (isPrime) {
		             System.out.println("This is a prime number");
		         } else {
		             System.out.println("This number is not prime");
		         }
		    }
		

	}


