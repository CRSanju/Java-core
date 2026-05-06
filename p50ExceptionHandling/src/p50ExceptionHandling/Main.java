package p50ExceptionHandling;

public class Main {

	public static void main(String[] args) {
		
		DrivingLicense dl = new DrivingLicense();
		dl.takeUserAge();
		try {
			dl.verify();
		} catch (UnderAgeException | OverAgeException e) {
			
			e.printStackTrace();
		} 

	}

}
