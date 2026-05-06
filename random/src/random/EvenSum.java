package random;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your number:");
		int n = scan.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter numbers:");
		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = scan.nextInt();
		}
		
		int esum = 0;
		int osum = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if(a[i] % 2 == 0) {
				esum += a[i];
			} else {
				osum += a[i];
			}
		}
		System.out.println("e" + esum);
		System.out.println("o" + osum);

		scan.close();
	}

}
