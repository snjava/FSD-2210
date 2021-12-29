
public class FinalKeyword {
	
	public final double PI = 3.14;

	/*
	  {   // initializer block 
		  PI = 3.14; 
	  }
	 */
	
	/*
	 public FinalKeyword() 
	 { 
	 	PI = 3.14; 
	 }
	 */
	
	public static void main(String[] args) {
		Employee e1= new Employee(23);
		Employee e2= new Employee(32);
		Employee e3= new Employee(12);
		Employee e4= new Employee(11);
		
		System.out.println("e1 : " + e1.id);
		System.out.println("e2 : " + e2.id);
		System.out.println("e3 : " + e3.id);
		System.out.println("e4 : " + e4.id);
	}
	
	public void test(final int a) {
		final double G = 9.8;
		
	}

}

final class Employee
{
	final int id;
	String name;
	public Employee(int id) {
		this.id = id;
	}	
	public final void test() {
		// logic
	}
}


















