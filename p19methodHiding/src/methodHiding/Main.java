package methodHiding;

public class Main {

	public static void main(String[] args) {
		
		Parent pr1 = new Parent();
		pr1.display1();
		pr1.display2();
		
		Child ch = new Child();
		ch.display1();
		ch.display2(); 
		
		Parent pr2 = new Child();
		pr2.display1();
		pr2.display2();

	}

}
