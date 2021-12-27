import java.io.Console;
public class ConsoleInOut
{
	public static void main(String[] args) {
		Console console = System.console(); // getting console Object
		String userName = console.readLine("Enter User Name : ");
		char passwordChar[] = console.readPassword("Enter Password : ");
		String password = new String(passwordChar);

		if ("admin".equals(userName) && "admin123".equals(password)) {
			System.out.println("Valid User...");
		} else {
			System.err.println("Invalid User...");
		}
	}
}