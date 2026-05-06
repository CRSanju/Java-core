package innerClassStatic;

public class Main {
	
	public static void main(String[] args) {
		
		Program1 p1 = new Program1();
		p1.disp1();
		
		Program1.Program2.disp2();
	}

}
