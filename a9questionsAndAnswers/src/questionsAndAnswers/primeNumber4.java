package questionsAndAnswers;

import java.util.Scanner;

public class primeNumber4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a new nnumber: ");
		int n =  scan.nextInt();
		int count = 0; 
	    for(int i = 2; i < Math.sqrt(n); i++) {
	    	if (n % i == 0) {
	    		count++;
	    	}
	    }
	    
	    if (count == 0) {
	    	System.out.println("Is a prime number.");
	    } else {
	    	System.out.println("Is not a prime number.");
	    }


	}

}
