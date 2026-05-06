package p50ExceptionHandling;

public class OverAgeException extends Exception {
	
	public OverAgeException() {
		super("You are too Old. Take rest.");
	}

}
