package array;

import java.util.Scanner;

public class Array4Traversing {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Heights :");
		
		for(int i = 0; i <= a.length - 1; i++) {
			a[i] = scan.nextInt();
		}
		
		System.out.println("The Heights are :");
		for(int i = 0; i<= a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
