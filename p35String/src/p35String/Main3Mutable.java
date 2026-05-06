package p35String;

import java.util.Scanner;

public class Main3Mutable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the 1st String");
		String s1 = scan.next();
		
		System.out.println("Enter the 2nd String");
		String s2 = scan.next();
		
		System.out.println("Enter the 3rd String");
		String s3 = scan.next();
		
		StringBuffer sb = new StringBuffer();
		sb.append(s1);
		sb.append(s2);
		
		System.out.println(sb);
		
		sb.append(s3);
		
		System.out.println(sb);
		
		scan.close();

	}

}
