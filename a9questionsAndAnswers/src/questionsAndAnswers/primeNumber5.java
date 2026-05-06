package questionsAndAnswers;

import java.util.Scanner;

public class primeNumber5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a new number");
        int n = scan.nextInt();
        findPrime(n);
	}
	
	public static void findPrime(int n) {
		int count = 0;
		for (int i = 1; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				count++;
			} 
		}
		
		if (count == 0) {
			System.out.println("Is a prime number");
		} else {
			System.out.println("Is not a prime number");
		}
	}

}
