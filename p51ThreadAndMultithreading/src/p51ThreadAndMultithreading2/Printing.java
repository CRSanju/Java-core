package p51ThreadAndMultithreading2;

public class Printing extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("Printing activity Started:");
		for(int i  = 1; i <= 5; i++) {
			System.out.println("KODNEST");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing activity completed");
		
	}

}
