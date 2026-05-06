package p42CollectionHastSet;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet hs = new HashSet();
		System.out.println("Enter the length you need");
		int n = scan.nextInt();
		System.out.println("Enter the elements you need");
		for(int i  = 0; i < n; i++) {
			hs.add(scan.nextInt());
		}
		
		System.out.println(hs);

		LinkedHashSet rs = new LinkedHashSet();
		System.out.println("Enter the elements you need");
		for(int i  = 0; i < n; i++) {
			rs.add(scan.nextInt());
		}
		
		System.out.println(rs);
	}

}
