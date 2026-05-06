package innerClass;

public class Main1 {
	
	public static void main(String[] args) {
		
		// Program1 p1 = new Program1();
		//  p1.disp1();
		
		//Program1.Program2 p2 = p1.new Program2();
		//p2.disp2();
		
		Program1.Program2 p2 = new Program1().new Program2();
		p2.disp2();
	}

}
