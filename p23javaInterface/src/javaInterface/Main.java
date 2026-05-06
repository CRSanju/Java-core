package javaInterface;

public class Main {

	public static void main(String[] args) {
		
		// Shape s1 = new Shape(); --- error
		
		Shape s = new Square();
		s.calArea();
	}
}
