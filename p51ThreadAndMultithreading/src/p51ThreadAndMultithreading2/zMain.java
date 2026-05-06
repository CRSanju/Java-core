package p51ThreadAndMultithreading2;

public class zMain {

	public static void main(String[] args) {
		
		
		System.out.print("Main thread execution started: ");
		
		zPrinting p = new zPrinting();
		zCharPrinting ch = new zCharPrinting();
		zAddition a = new zAddition();
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(ch);
		Thread t3 = new Thread(a);
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Main thread execution completed: ");

	}

}
