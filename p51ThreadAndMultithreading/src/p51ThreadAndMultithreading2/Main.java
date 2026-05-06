package p51ThreadAndMultithreading2;

public class Main {

	public static void main(String[] args) {
	  
		Printing p = new Printing();
		CharPrinting ch = new CharPrinting();
		Addition a = new Addition();
		
		p.start();
		ch.start();
		a.start();

	}

}
