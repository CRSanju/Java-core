package z51ProducerConsumer;

public class Factory {

	int x;
	boolean isProduced = false;

	synchronized public void setData(int x) {
		if (isProduced == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.x = x;
		System.out.println("I have put " + x + " in the factory");
		isProduced = true;
		notify();
	}

	synchronized public void getData() throws InterruptedException {
		if (isProduced == false) {
			wait();
		}
		System.out.println("I have taken " + x + " from the factory");
		isProduced = false;
		notify();
	}
}
