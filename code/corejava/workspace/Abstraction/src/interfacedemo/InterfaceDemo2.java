package interfacedemo;

public class InterfaceDemo2 {
	public static void main(String[] args) {
	
	}
}


interface I1 {
	void m1();
}

interface I2 {
	void m2();
}

// a. One interface extends more than one interface.
interface I3 extends I1, I2 {
	void m3();
}
 
// b. One class can implements more than one interface.
class Demo1 implements I1, I2 {
	public void m1() {
		System.out.println("m1 from Demo1");
	}
	public void m2() {
		System.out.println("m2 from Demo1");
	}
}

// c. One class extends another class and implements one or more interfaces.
class Demo2 extends Demo1 implements I3 {
	public void m3() {
		System.out.println("m3 from Demo2");
	}
}













