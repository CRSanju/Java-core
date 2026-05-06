package p50ExceptionHandling;

class Parent {
	
	void display() throws Exception {
		System.out.println("Inside parent display");
	}
}

class Child extends Parent {
	
	@Override
	void display() throws Exception {
		System.out.println("Inside child display");
	}
}

public class Program6 {

	public static void main(String[] args) {
		
		Child ch = new Child();
		try {
			ch.display();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
