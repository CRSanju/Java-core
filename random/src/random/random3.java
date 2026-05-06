package random;

import java.util.Scanner;

public class random3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		for (int i = num ; i >= 1 ; i--) {
			System.out.println(i);
		}
	}

}
