package p51ThreadAndMultithreading;

public class Program1 {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("Raju");
		System.out.println(t);
		t.setPriority(7);
		System.out.println(t);
		t.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t);
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t);

	}

}
