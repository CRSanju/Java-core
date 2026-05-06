package lamdaExpression;

public class Main {

	public static void main(String[] args) {
		
		Program p = (int a)-> {
			                          // you can write the same without providing curly brackets
			System.out.println("Inside display");
			System.out.println(a);
			
			// If there is more than one statement then you have to use curly brackets
		};
		
		p.disp(5);

	}

}
