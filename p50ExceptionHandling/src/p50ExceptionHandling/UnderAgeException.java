package p50ExceptionHandling;

public class UnderAgeException extends Exception {

	 public  UnderAgeException() {
		super("You are too young. Try after turing 18");
	}
}
