package p35String;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String");
		String s = scan.nextLine();
		
	    String arr[] = s.split(" ");
	    
	    String sarr = String.join("", arr);
	    
	    System.out.println("Original String: " + s);
	    System.out.println("Modified String: " + sarr);

      scan.close();

	}

}
