
public class InvalidCadetException extends Exception {
	public InvalidCadetException() {
		super("Cadet is not qualified.");
	}
	
	public InvalidCadetException(String message) {
		super(message);
	}
}
