package p51ThreadAndMultithreading7;

public class Printing implements Runnable  {

	@Override
	   synchronized public void run() {
		
		try { 
			
		String threadName = Thread.currentThread().getName();	
		System.out.println(threadName + " started using the printer");
		Thread.sleep(3000);
		System.out.println(threadName + " is using the printer");
		Thread.sleep(3000);
		System.out.println(threadName + " finished using the printer");
		Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
