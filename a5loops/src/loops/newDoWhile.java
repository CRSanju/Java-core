package loops;

public class newDoWhile {

	public static void main(String[] args) {
		int i = 1;
		 do {
			
			int j = 1;
		   do {
				System.out.println("i: " + i + "j: " + j);
				j++;
			} 	while(j <= 4);
			System.out.println();
			i++;
			
		}while(i <= 3);

	}

}
