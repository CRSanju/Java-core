package loops;

public class factorial {

	public static void main(String[] args) {
		int n = 3;
		int m = 5;
		int factN = 1;
		int factM = 1;
		int i = 1;
		while (i <= n) {
			factN = factN * i;
					i++;
					
		}
		
		i = 1;
		
		while(i <= m) {
			factM = factM * i;
			i++;
		}
		System.out.println(factN);
		System.out.println(factM);
		}
        

}
