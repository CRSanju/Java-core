package loops;

public class sumOfEvenAndOdd {

	public static void main(String[] args) {
		int evenSum = 0;
		int oddSum = 0;
		int i = 1;
		while(i <= 10) {
			if(i%2==0) {
				evenSum = evenSum + i;
			} else if (i%2 != 0) {
				oddSum = oddSum + i;
			}
			i++;
		}
		System.out.println(evenSum);
		System.out.println(oddSum);
	}

}
