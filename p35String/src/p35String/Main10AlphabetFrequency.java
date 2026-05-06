package p35String;

import java.util.Scanner;

public class Main10AlphabetFrequency {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
	    int n = s.length();
	    
	    for(int i = 0; i <= n - 1; i++) {
	    	char ch = s.charAt(i);
	    	if(s.indexOf(ch) != i) {
	    		continue;
	    	}
	    	int count = 0;
	    	for(int j = 0; j <= n -1; j++) {
	    		if(ch == s.charAt(j)) {
	    			count++;
	    		}
	    	}
	    	System.out.println(ch + ": " + count);
	    }
	    
	    sc.close();

	}

}
