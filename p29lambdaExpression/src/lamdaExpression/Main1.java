package lamdaExpression;

public class Main1 {

	public static void main(String[] args) {
		
		Program1 p = (int a, int b)-> {
			  //--------------> you don't even need to write "return".
			return a + b;
			
		};
		
		int result = p.disp(4, 6);
		System.out.println(result);
	}

}
