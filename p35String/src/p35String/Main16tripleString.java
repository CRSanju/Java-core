package p35String;

import java.util.Scanner;

public class Main16tripleString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String step1 = new StringBuffer(s).reverse().toString();
		String step2 = step1.toUpperCase();
		String step3 = step2.replaceAll("[AEIOU]", "*");
		System.out.println(s);
		System.out.println(step1);
		System.out.println(step2);
		System.out.println(step3);
		
		sc.close();
	
	}

}
