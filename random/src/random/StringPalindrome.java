package random;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		char arr[] = str.toCharArray();
		
		char revArr[] = new char[arr.length];
		int j = revArr.length - 1;
		
		for (int i = 0; i <= arr.length - 1; i++) {
			revArr[i] = arr[i];
			j--;
		}
		
		for (int i = 0; i <= revArr.length - 1; i++) {
			System.out.print(revArr[i]);
		}
		
		System.out.println();
		String revStr = new String(revArr);
		if(str.equals(revStr)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
		
		sc.close();
	}

}
