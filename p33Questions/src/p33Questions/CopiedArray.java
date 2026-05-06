package p33Questions;

import java.util.Scanner;

public class CopiedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a[] =  new int[5];
		
		System.out.println("Enter the elements:");
		for(int i = 0; i <= a.length - 1; i++) {
			a[i] = scan.nextInt();
		}
		
		System.out.println("The elements are:");
		for(int i = 0; i <= a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}

		int b[] = new int[5];
		int j = 0;
		
		for (int i = 0; i <= a.length - 1; i++) {
			b[j] = a[i];
			j++;
		}
		
		System.out.println();
		System.out.println("Copied elements are:");
		for (int i = 0; i <= b.length - 1; i++) {
			System.out.print(b[i] + " ");
		}
		
		scan.close();
		

	}

}
