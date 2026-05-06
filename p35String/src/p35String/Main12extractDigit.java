package p35String;

import java.util.Scanner;

public class Main12extractDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = sc.nextLine();
		
		String res = "";
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= '0' && ch <= '9') {
				res = res + ch;
			}
		}
		
		System.out.println("Extracted digit: " + res);
		
		
      sc.close();
	}

}
