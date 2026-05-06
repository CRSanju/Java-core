package javainterface2;

public class MyCalculator implements Calculator2 {
	
	public void add() {
		System.out.println(10 + 20);
	}
	
	public void sub() {
		System.out.println(10 - 5);
	}
	
	public void mul() {
		int a = 20, b = 10;
		System.out.println(a * b);
	}
	
	public void div() {
		int a = 20, b = 10;
		System.out.println(a / b);
	}

}
