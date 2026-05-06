package questionsAndAnswers;

public class primeNumber2 {
   //To check if the number is prime or not.
	public static void main(String[] args) {
		int number =  7;
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
			
		}
		
		if (count == 0) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}

	}

}
