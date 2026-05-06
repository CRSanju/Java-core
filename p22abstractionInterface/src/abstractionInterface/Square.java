package abstractionInterface;

import java.util.Scanner;

public class Square extends Shape {
	
	Scanner scan = new Scanner(System.in);

	int side = scan.nextInt();
	
	void calArea() {
		System.out.println(side * side);
	

}
			}
