package innerClassLocal;

public class Program1 {
	
	int a = 10;
	
	void myMethod() { // ----------------> inside the method there is a Class and it is called local class.
	   class Program2 {
		
		  int b  = 20;
		
	       void disp2() {
			System.out.println(b);
		}
	}
	   
	   Program2 p2 = new Program2();
	   p2.disp2();
}
	
	
	void disp1() {
		
		System.out.println(a);	
	}

}
