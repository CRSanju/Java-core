package p33Questions;

import java.util.Scanner;

public class MinElementArray {

	public static void main(String[] args) {
		
		  Scanner scan = new Scanner(System.in);
			
			int a[] =  new int[5];
			
			System.out.println("Enter the elements:");
			for(int i = 0; i <= a.length - 1; i++) {
				a[i] = scan.nextInt();
			}
			
			int min = a[0];
			System.out.println("Original elements are:");
			for(int i = 0; i <= a.length - 1; i++) {
				System.out.print(a[i] + " ");
				if(a[i] < min) {
					min = a[i];
				}
			}
			System.out.println("Min: " + min);

			scan.close();
	}
}
