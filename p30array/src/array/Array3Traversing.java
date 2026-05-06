package array;

import java.util.Scanner;

public class Array3Traversing {

	public static void main(String[] args) {
	
		int a[] = new int[5];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a new number :");
		
		for(int i = 0; i <= 4; i++) {
			a[i] = scan.nextInt();
		}
		
		System.out.println("Array Elements are :");
		for(int i = 0; i <= 4; i++) {
			System.out.println(a[i]);
		}

	}

}
