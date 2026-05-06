package p51ThreadAndMultithreading3;

public class CharPrinting implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Char printing activity  Started");
		for(char ch = 'A'; ch <= 'I'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Char printing activity  Completed");
	}


}
