package innerClassAnonymous;

public class Main2 {
	
	public static void main(String[] args) {

	
	Program2 p = new Program2() {
		
		public void disp() {
			System.out.println("Inside display");
		}
		
	};
	
	p.disp();
	
	}
	
}
