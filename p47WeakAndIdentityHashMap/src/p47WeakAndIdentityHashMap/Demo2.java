package p47WeakAndIdentityHashMap;

import java.util.*;

public class Demo2 {

	public static void main(String[] args) {
	
		String s1 = new String("key");
		String s2 = new String("key");
		
		IdentityHashMap<String, String> id = new IdentityHashMap<>();
		id.put(s1, "Value1");
		id.put(s2, "Value2");
		
		System.out.println(id);
		
	}

}
