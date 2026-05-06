package p50ExceptionHandling;

class Parent2 {
	
	void display() throws  ArithmeticException {
		System.out.println("Inside parent display");
	}
}

class Child2 extends Parent2 {
	
	@Override
	void display() throws ArrayIndexOutOfBoundsException {
		System.out.println("Inside child display");
	}
}

public class Program8 {

	public static void main(String[] args) {
		
		Child2 ch = new Child2();
		try {
			ch.display();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
