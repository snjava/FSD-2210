package abstractclass;

public class AbstractClassIntro {
	public static void main(String[] args) {
		// AbstractDemo1 obj = new AbstractDemo1(); // compilation error
		NonAbstractDemo obj = new NonAbstractDemo();
		obj.m1();
		obj.m2();
	}
}

abstract class AbstractDemo1 {
	public void m1() {
		System.out.println("M1 method from Abstract class");
	}
	public abstract void m2();	
}

class NonAbstractDemo extends AbstractDemo1 {
	public void m2() {
		System.out.println("M2 from the Non-abstract class");
	}
}

abstract class AbstractDemo2 extends AbstractDemo1 {
	
}


