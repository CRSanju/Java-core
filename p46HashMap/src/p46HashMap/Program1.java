package p46HashMap;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(1, 100);
		hm.put(2, 200);
		hm.put(3, 300);
		hm.put(4, 400);
		System.out.println(hm);
		System.out.println(hm.get(3));
	}

}
