package pack2;
import pack1.C1;
public class C3 extends C1 {

	
	public void byInheritance() {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
	}
	
	public void byObject() {
		C1 c1 = new C1();
		System.out.println("a : " + c1.a);
		System.out.println("b : " + c1.b);
		System.out.println("c : " + c1.c);
		System.out.println("d : " + c1.d);
	}
	
}
