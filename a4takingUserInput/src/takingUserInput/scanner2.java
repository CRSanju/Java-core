package takingUserInput;
import java.util.Scanner;

public class scanner2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your fullname :");
		String a = scan.nextLine();
		System.out.println("Your full name is :" + a);
	}
}
