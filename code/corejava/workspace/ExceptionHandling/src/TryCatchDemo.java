import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter User Name : ");
		String name = scan.next();
		
		try { // try with multiple catch (you cannot handle/write a parent catch block before child)
			System.out.println("Enter 1st Number : ");
			int num1 = scan.nextInt();
			
			System.out.println("Enter 2nd Number : ");
			int num2 = scan.nextInt();
			
			System.out.println("Add : " + (num1 + num2));
			System.out.println("Sub : " + (num1 - num2));
			try { // nested try catch
				System.out.println("div : " + (num1 / num2));
			} catch(ArithmeticException e) {
				System.err.println("You cannot divide any number by 0...");
			}
			System.out.println("Mul : " + (num1 * num2));
		}
		catch(InputMismatchException e) {
			System.err.println("Please enter valid input and try again...");
		}
		catch(ArithmeticException e) {
			System.err.println("You cannot divide any number by 0...");
		}
		catch(Exception e) {
			System.err.println("Any Other Exception is Occurs..");
		}
		
		System.out.println("End of the program...");
	}
}
