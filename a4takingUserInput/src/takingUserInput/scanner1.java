package takingUserInput;
import java.util.Scanner;

public class scanner1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a byte value :");
		byte a = scan.nextByte();
		System.out.println(a);
		
		System.out.println("Enter a short value :");
		short b = scan.nextShort();
		System.out.println(b);
		
		System.out.println("Enter a int value :");
		int c  = scan.nextInt();
		System.out.println(c);
		
		System.out.println("Enter a long value :");
		long d = scan.nextLong();
		System.out.println(d);
		
		System.out.println("Enter a float value :");
		float e = scan.nextFloat();
		System.out.println(e);
		
		System.out.println("Enter a double value :");
		double f = scan.nextDouble();
		System.out.println(f);
		
		System.out.println("Enter a boolean value :");
		boolean g = scan.nextBoolean();
		System.out.println(g
				);
				
		
	}

}
