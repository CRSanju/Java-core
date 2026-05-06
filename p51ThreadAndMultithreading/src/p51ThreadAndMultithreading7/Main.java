package p51ThreadAndMultithreading7;

public class Main {

	public static void main(String[] args) {
		
		Printing p = new Printing();
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(p);
		
		t1.setName("Java Developer");
		t2.setName("Python Developer");
		t3.setName("C Developer");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
