
public class NegativeAgeException extends Exception {
	public NegativeAgeException() {
		super("Input for age is negative.");
	}
	
	public NegativeAgeException(String message) {
		super(message);
	}
}
