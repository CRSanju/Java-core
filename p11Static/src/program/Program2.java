package program;

public class Program2 {
	static int a;
	static {
		System.out.println("Inside static-block");
		a = 10;
	}
	int b;
	void display() {
		System.out.println("Inside non-static method");
		System.out.println(a);
		System.out.println(b);
	}
	
    public static void main(String[] args) {
    	Program2 p1 = new Program2();
    	p1.a = 100;
    	p1.display();
    	Program2 p2 = new Program2();
    	p2.a = 200;
    	p2.display(); 	
    }
}
