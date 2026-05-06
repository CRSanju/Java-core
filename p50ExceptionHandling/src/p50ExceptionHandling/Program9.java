package p50ExceptionHandling;

import java.io.IOException;

class Parent3 {
	
	void display() throws Exception {
		System.out.println("Inside parent display");
	}
}

class Child3 extends Parent3 {
	
	@Override
	void display() throws IOException {
		System.out.println("Inside child display");
	}
}

public class Program9 {

	public static void main(String[] args) {
	
		Child3 ch = new Child3();
		try {
			ch.display();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
