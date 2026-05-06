package array;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		int arr[] = new int[size];
		
		
		System.out.println("Enter Elements to store:");
		for(int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Array Elements are :");
		System.out.print("[");
		for(int i = 0; i <= arr.length - 1; i++) {
			
			if(i != size - 1) {
				System.out.print(arr[i] + ", ");
			} 
			else 
			{
				System.out.print(arr[i]);
			}
			
		}
		System.out.print("]");
	


	}

}
