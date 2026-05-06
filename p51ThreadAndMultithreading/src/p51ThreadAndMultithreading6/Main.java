package p51ThreadAndMultithreading6;

public class Main {

	public static void main(String[] args) {
		
		TextEditor ts = new TextEditor();
		
		Thread t1 = new Thread(ts);
		Thread t2 = new Thread(ts);
		Thread t3 = new Thread(ts);
		
		//Set the name
		t1.setName("TYPE");
		t2.setName("SPELLCHECK");
		t3.setName("SAVE");
		
		//Set the priority as minimum
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		//Set Daemon
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
