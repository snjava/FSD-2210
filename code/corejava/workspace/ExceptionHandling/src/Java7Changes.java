import java.util.InputMismatchException;
import java.util.Scanner;

public class Java7Changes {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {

		} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException | IndexOutOfBoundsException e) {
			System.out.println("Got Exception");
		} 
		catch (ClassCastException | InputMismatchException ex) {
			
		}
	}

}
