package pack1;

public class C2 extends C1{

	public void byObject() {
		C1 c = new C1();
		System.out.println("a " + c.a);
		System.out.println("b " + c.b);
		System.out.println("c " + c.c);
		System.out.println("d " + c.d);
	}
	
	public void byInheritance() {
		System.out.println("a " + a);
		System.out.println("b " + b);
		System.out.println("c " + c);
		System.out.println("d " + d);
	}
	
}
