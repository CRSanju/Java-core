package limitationsParent;

public class Main {

	public static void main(String[] args) {
		
		Parent p = new Child();
		p.display1();
		p.display2();
		
		// p.display3(); // Cannot call this method as this is not present in the parent class. So, this is one of the limitation.
      
		((Child)(p)).display3();
	}

}
