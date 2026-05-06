package p35String;

import java.util.Scanner;

public class Main11ASCII {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		int asciiVal = ch;
		
		System.out.println("The ASCII value of " + ch + " is " + asciiVal);
		
		sc.close();

	}

}
