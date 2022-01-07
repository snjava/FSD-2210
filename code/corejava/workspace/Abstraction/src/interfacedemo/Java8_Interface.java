package interfacedemo;

@FunctionalInterface
public interface Java8_Interface {
	void m1();
	public default void m2() {
		System.out.println("This is default methods from interface");
	}
	public static void m3() {
		System.out.println("This is static method from Interface");
	}
	public static void main(String[] args) {
		System.out.println("This is Main methods from the Interface...");
	}
}

class TestDemo {
	public static void main(String[] args) {
		Java8_Interface.m3();
	}
}
