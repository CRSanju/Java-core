package p35String;

import java.util.Scanner;

public class Main9subString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your string");
		String s = sc.nextLine();
		int n = s.length();
		
		for(int i = 0; i <= n -1; i++) {
			String temp = "";
			for(int j = i; j <= n - 1; j++) {
				temp = temp + s.charAt(j);
				System.out.println(temp);
			}
		}
		
		sc.close();
	}

}
