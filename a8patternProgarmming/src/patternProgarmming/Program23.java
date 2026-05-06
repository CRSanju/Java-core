package patternProgarmming;

public class Program23 {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			char x = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(x);
				x++;
			}
			System.out.println();
		}

	}

}
