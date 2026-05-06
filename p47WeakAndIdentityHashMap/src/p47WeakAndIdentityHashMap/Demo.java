package p47WeakAndIdentityHashMap;

public class Demo {

	public static void main(String[] args) {
		
		String s = "Hello World";
		System.out.println(s);
		
		s = null;
		
		System.gc();
        System.out.println(s);
	}

}
