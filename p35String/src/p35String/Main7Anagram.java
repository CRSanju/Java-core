package p35String;

import java.util.Arrays;
import java.util.Scanner;

public class Main7Anagram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 1st String");
		String s = sc.nextLine();
		
		System.out.println("Enter the 2nd String");
		String p = sc.nextLine();
		
		char arr1[] = s.toCharArray();
		char arr2[] = p.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String s1 = new String(arr1);
		String s2 = new String(arr2);
		
		if(s1.equals(s2)) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}
		
		sc.close();

	}

}
