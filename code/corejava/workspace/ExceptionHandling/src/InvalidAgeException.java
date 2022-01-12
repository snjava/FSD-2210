
public class InvalidAgeException extends Exception {
	public void printErrorMessage() {
		System.err.println("You provided invalid age.. Age must not be negative....");
	}
}
