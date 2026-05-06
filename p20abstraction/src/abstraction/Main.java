package abstraction;

public class Main {

	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		accessMethod(c1);
		
		Child2 c2 = new Child2();
	    accessMethod(c2);
	}

	public static void accessMethod(Parent pr) {
		pr.disp1();
		pr.disp2();
	}
	
}
