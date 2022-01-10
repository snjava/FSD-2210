
public class ExceptionIntro {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		System.out.println("add : " + (a+b));
		
		try {
			System.out.println("Div : " + (a/b));
		}
		catch(ArithmeticException e) {
			System.err.println("You cannot divide any number by 0....");
		}
		
		System.out.println("Sub : " + (a-b));
		System.out.println("Mul : " + (a*b));
		
		System.out.println("Complete the number operations....");
		
	}
}
