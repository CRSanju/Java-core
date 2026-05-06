package random;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a[] = new int[n];

		int p = scan.nextInt();
		int b[] = new int[p];
		
		System.out.println("Enter elements in array:");
		for (int i = 0; i <= a.length-1; i++) {
			a[i] =  scan.nextInt();
		}
		
		System.out.println("Enter elements in second array:");
		for (int i = 0; i <= b.length - 1; i++) {
			b[i] = scan.nextInt();
		}
		
		int mer[] = new int[a.length + b.length];
		for(int i = 0; i <= a.length - 1; i++) {
			mer[i] = a[i];
		}
		for(int i = 0; i <= b.length - 1; i++) {
			mer[i + a.length] = b[i];
		}
		
		for(int i = 0; i <= mer.length - 1; i++) {
			System.out.print(mer[i] + " ");
		}
		
		scan.close();
		

	}

}
