package innerClassAnonymous;

public class Main {

	public static void main(String[] args) {
		
		Program p = new Program() {
			void disp() {     // -----------> this is the anonymous class.
			    System.out.println("Inside display"); 
			}
		};
		
		p.disp();

	}

}
