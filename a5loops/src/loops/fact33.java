package loops;

import java.util.Scanner;

public class fact33 {
	public static  void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		int a = 1;
		int i = 1;
		while (i <= n) {
			a = a * i;
			i++;
		}
		System.out.println(a);
	}

}
