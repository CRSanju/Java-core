package p51ThreadAndMultithreading3;
public class Main {

	public static void main(String[] args) {
			
      System.out.println("Main thread execution started: ");
		
		Printing p = new Printing();
		CharPrinting ch = new CharPrinting();
		Addition a = new Addition();
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(ch);
		Thread t3 = new Thread(a);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main thread execution completed");

	}

}
