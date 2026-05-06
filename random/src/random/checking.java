package random;
import java.util.Scanner;

public class checking {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int N = scan.nextInt();
		int i = N;
		while (i >= 1) {
			i--;
			System.out.println(i);
		}
	}

}
