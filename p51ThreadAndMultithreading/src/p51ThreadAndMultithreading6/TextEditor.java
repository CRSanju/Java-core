package p51ThreadAndMultithreading6;

public class TextEditor implements Runnable {
	
	@Override
	public void run() {
		try {
			String threadName = Thread.currentThread().getName();
			
			if(threadName.equals("TYPE")) {
				typing();
			} else if(threadName.equals("SPELLCHECK")) {
				spellCheck();
			} else {
				saving();
			}
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void typing() throws InterruptedException {
		for(int i  = 1; i <= 5; i++) {
			System.out.println("Typing.....");
			Thread.sleep(3000);
		}
	}
	
	public void spellCheck() throws InterruptedException {
		for(;;) {
			System.out.println("SpellChecking.....");
			Thread.sleep(3000);
		}
	}
	
	public void saving() throws InterruptedException {
		for(;;) {
			System.out.println("Saving.....");
			Thread.sleep(3000);
		}
	}

}
