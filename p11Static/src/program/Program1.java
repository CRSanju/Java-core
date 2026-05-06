package program;

public class Program1 { 
	
	static int a;
	static int b;
	
	int p;
	int q;
	
	static {
		System.out.println("Inside the static block");
		a = 10;
		b = 20;
	}
	
	{
		System.out.println("Inside the non-static block");
		p = 100;
		q = 200;
	}
	
	static void display1() {
		System.out.println("Inside the static method");
		System.out.println(a);
		System.out.println(b);
	}
	
	void display2() {
		System.out.println("Inside the non-static method");
		System.out.println(p);
		System.out.println(q);
	}
	
	
	public static void main(String[] args) {
		Program1 p1 = new Program1();
		p1.display1();
		p1.display2();
	}
	

}
