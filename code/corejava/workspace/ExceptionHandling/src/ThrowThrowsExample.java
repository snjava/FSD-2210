import java.util.Scanner;

public class ThrowThrowsExample {

	public static void main(String[] args) {
		ageOperation();
	}

	public static void ageOperation() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age Value : ");
		int age = scan.nextInt();
		
		try {
			if(age<0) { // Scenario identification
				//ArithmeticException ex = new ArithmeticException("Age Cannot be negative..."); // create Object of exception
				InvalidAgeException ex = new InvalidAgeException();// create object of custom exception
				throw ex; // throwing exception manually.
			}
		}
		catch(InvalidAgeException e) {
			e.printErrorMessage();
		}
		finally {
			scan.close();
		}
		System.out.println("Your Age is : " + age);
		
	}
	
}
