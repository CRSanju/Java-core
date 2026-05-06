package questionsAndAnswers;

import java.util.Scanner;

public class PrimeNumberStartAndEnd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int start = scan.nextInt();
		System.out.println("Enter the end number");
		int end = scan.nextInt();
		
		if (start == 1) {
			start++;
		}
		for (int i = start; i <= end; i++) {
			if (findPrime(i)) {
				System.out.println(i + " ");
			}
		}
}
	
	public static boolean findPrime(int n) {
		
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
