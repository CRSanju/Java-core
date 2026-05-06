package p35String;

import java.util.Scanner;

public class Main15stringRotation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s = sc.nextLine();
		
		System.out.println("Enter the second string");
		String r = sc.nextLine();
		
		String combinedStr= s + s;
		
		if(combinedStr.contains(r)) {
			System.out.println("The String " + r + " is a rotation of " + s + ".");
		} else {
			System.out.println("The String " + r + " is not a rotation of " + s + ".");
		}

		sc.close();
	}

}
