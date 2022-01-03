public class RuntimePloy {
	public static void main(String[] args) {
		C1 obj1 = new C2(); // Polymorphic Object
		C1 obj2 = new C3(); // Polymorphic Object
		C1 obj3 = new C1(); // Not a Polymorphic Object
		executePrint(obj2);
	}
	public static void executePrint(C1 c) {
		c.print();
	}
}
class C1 {
	public void print() {
		System.out.println("Hi I am from C1 class");
	}
}
class C2 extends C1 {
	public void print() {
		System.out.println("Hi I am from C2 class");
	}
}
class C3 extends C1{
	public void print() {
		System.out.println("Hi I am from C3 class");
	}
}