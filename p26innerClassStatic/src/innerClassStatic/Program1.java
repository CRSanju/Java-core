package innerClassStatic;

public class Program1 {
	
	int a = 10;
	
	static class Program2 {
		
		static int b  = 20;
		
		static void disp2() {
			System.out.println(b);
		}
	}
	
	void disp1() {
		
		System.out.println(a);
		Program2.disp2();
		
	}

}
