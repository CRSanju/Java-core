package innerClass;

public class Program1 {
	
	int a = 10; //-------------------> member data
	
	class Program2 { // -------------------------> member inner class
		
		int b = 20;
		
		void disp2() {
			System.out.println(a);
			System.out.println(b);
		}
	}
	
	void disp1() { // ----------------> member function
		System.out.println(a);
		Program2 p2 = new Program2();
		p2.disp2();
	}

}
