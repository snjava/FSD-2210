package interfacedemo;

public class InterfaceDemo1 {
	public static void main(String[] args) {
		Inter1 it1 = new InterDemo1();
		it1.m1();
		it1.m2();
	}
}

interface Inter1 {
	int a = 10; // public static final int a = 10;
	void m1(); // public abstract void m1();
	default void m2() { // default method is allowed from java 1.8 onwards 
		int b = 10;
		System.out.println("Default m2 method from Interface.");
	}
}

abstract class InterDemo2 implements Inter1 {
}

class InterDemo1 implements Inter1 {
	public void m1() {
		System.out.println("m1 method from class");
	}
}
