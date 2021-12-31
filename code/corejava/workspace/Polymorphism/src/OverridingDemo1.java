
public class OverridingDemo1 {
	public static void main(String[] args) {
		HpPrinter hp = new HpPrinter();
		hp.print("Test Value");
	}
}

class Printer {
	final public void basicFeatures() {
		System.out.println("Print the document");
	}
	void print(String val) {
		System.out.println("Printing from the Printer : " + val);
	}
	public A getVal() {
		return new A();
	}
}

class HpPrinter extends Printer {
	void print(String val) {
		System.out.println("Printing from the HP-Printer : " + val);
	}
	public C getVal() { // sub-type return data.
		return new C();
	}
}

class A {
	
}
class B extends A{
	
}
class C extends B{
	
}


