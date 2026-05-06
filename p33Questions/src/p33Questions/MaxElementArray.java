package p33Questions;

import java.util.Scanner;

public class MaxElementArray {

	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
		
		int a[] =  new int[5];
		
		System.out.println("Enter the elements:");
		for(int i = 0; i <= a.length - 1; i++) {
			a[i] = scan.nextInt();
		}
		
		int max = a[0];
		System.out.println("Original elements are:");
		for(int i = 0; i <= a.length - 1; i++) {
			System.out.print(a[i] + " ");
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("max: " + max);

		scan.close();
	}

}
