package p35String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main14regularExpression {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		Pattern pattern = Pattern.compile("[A-Za-z]+$");
		Matcher matcher = pattern.matcher(s);
		if(matcher.matches()) {
			System.out.println("Valid String ! only alphabets");
		} else {
			System.out.println("Invalid String");
		}

		sc.close();
	}

}
