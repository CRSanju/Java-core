package p50ExceptionHandling;

import java.util.Scanner;

public class DrivingLicense {
	
	int age;
	
	void takeUserAge() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		age = scan.nextInt();
		scan.close();
	}
	
	void verify() throws UnderAgeException, OverAgeException {
		if(age < 18) {
	       throw new UnderAgeException();

		} else if(age > 65) {
			throw new OverAgeException();

		}else {
			System.out.println("Driving License should be given");
		}
	}

}
