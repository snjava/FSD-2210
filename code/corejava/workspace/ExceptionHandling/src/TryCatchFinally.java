import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter User Name : ");
		String name = scan.next();
		
		System.out.println("Enter Age : ");
		int age = 0;
		try {
			age = scan.nextInt();
		}
		catch(InputMismatchException e) {
			System.err.println("Invalid Age....");
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Half Age : " + 20/age);
		}
		finally {
			System.out.println("=======Finally Block===========");
			scan.close();
		}
		String capitalName = name.toUpperCase();
		System.out.println("Name = " + capitalName);
		System.out.println("Age = " + age);
		
		System.out.println("End of the program...");
	}

}
