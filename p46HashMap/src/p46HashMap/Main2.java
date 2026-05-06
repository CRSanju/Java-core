package p46HashMap;

import java.util.*;

public class Main2 {

	public static void main(String[] args) {
	     HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Apple");
        hm.put(2, "Banana");
        hm.put(3, "Cherry");
        for(Map.Entry<Integer,  String> x: hm.entrySet()) {
        	System.out.println("Key: " + x.getKey());
        	System.out.println("Value: " + x.getValue());
        }
  
	}

}
