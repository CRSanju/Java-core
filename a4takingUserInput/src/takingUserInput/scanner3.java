package takingUserInput;
import java.util.Scanner;

public class scanner3 {
public static void  main(String[] args) {
Scanner scan = new Scanner(System.in);
float value = scan.nextFloat();
float result = square(value);
System.out.println(result);
}

public static float square(float value) {
	return value * value;
}
}
