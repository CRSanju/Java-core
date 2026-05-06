package p50ExceptionHandling;

class Parent1 {
	
	void display() throws Exception {
		System.out.println("Inside parent display");
	}
}

class Child1 extends Parent1 {
	
	@Override
	void display() throws ArithmeticException {
		System.out.println("Inside child display");
	}
}

public class Program7 {

	public static void main(String[] args) {
		
		Child1 ch = new Child1();
		try {
			ch.display();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
