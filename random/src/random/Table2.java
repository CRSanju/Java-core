package random;

import java.util.Scanner;

public class Table2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		for(int i = 1; i <= 10; i++) {
			int table = n * i;
			System.out.println(n + " * " + i + " = " +table);
		}

	}

}
