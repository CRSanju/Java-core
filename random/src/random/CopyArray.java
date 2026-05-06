package random;

import java.util.Scanner;

public class CopyArray {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter your array  elements:");
		for(int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Your array elements are:");
		for(int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int copyArr[] = new int[n];
		int j = 0;
		for(int i = 0; i <= arr.length - 1; i++) {
			copyArr[j] = arr[i];
			j++;
		}
		
		System.out.println();
		System.out.println("Copied Array  is:");
		for (int i = 0; i <= copyArr.length - 1; i++) {
			System.out.print(copyArr[i] + " ");
		}
		
		
		scan.close();
		
	}

}
