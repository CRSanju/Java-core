package javaInterface;

public class Square implements Shape {
	
	int side = 5;
	
	public void calArea() {
		System.out.println(side * side);
	}

}
