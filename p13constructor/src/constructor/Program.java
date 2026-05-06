package constructor;

public class Program {

	public Program ( ) {
		System.out.println("The constructor is excecuted");
	}
	
	{
		System.out.println("The instance block is excecuted");
	}
	
	static {
		System.out.println("The static block is excecuted");
	}
}
