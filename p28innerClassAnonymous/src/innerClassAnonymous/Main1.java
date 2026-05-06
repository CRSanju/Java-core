package innerClassAnonymous;

public class Main1 {

	public static void main(String[] args) {
		
		Program1 p = new Program1() {
			
			
			@Override 
			void add() {
				System.out.println("for addition");
			}
			
			@Override
			void sub() {
				System.out.println("for subtraction");
			}
			
			@Override
			void mul() {
				System.out.println("for multiplication");
			}
			
		};
		
		p.add();
		p.sub();
		p.mul();

	}

}
