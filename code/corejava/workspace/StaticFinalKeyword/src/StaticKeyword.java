
public class StaticKeyword {
	public static void main(String[] args) {
		System.out.println(Person.name);
		Person.print();
		
	}
}

class Person {
	final static String name ="Abcd"; // class or static variable
	int age = 22;
	public static void print() {
		System.out.println("Name : " + name);
		
	}
	static class A {
		
	}
	
}