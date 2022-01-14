import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionRuleInPolymorphism {
	public static void main(String[] args) {
		
	}
}



/*
	 Throwable
	 	^
	 	|
	 	|
	 Exception
	 	^
	 	|
	 	|
	 IOException
	 	^
	 	|
	 	|
	 FileNotFoundException
 */

class A {
	public void m() throws IOException {
		System.out.println("From A class");
	}
}

class B extends A{
	public void m(int a) throws Exception { // Overloading
		System.out.println("From B class with 1 int");
	}
	
	
	public void m() throws Exception {  // Overriding
		System.out.println("From B class");
	}
	
}
