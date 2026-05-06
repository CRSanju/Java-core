package z51ProducerConsumer;

public class Producer implements Runnable {

	Factory factory;
	
	public Producer(Factory factory) {
		this.factory = factory;
	}
	
	public void run() {
		int x = 1;
		while(true) {
			factory.setData(x++);
		}
	}
}
