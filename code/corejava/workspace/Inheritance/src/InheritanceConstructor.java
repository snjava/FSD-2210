
public class InheritanceConstructor {
	public static void main(String[] args) {
		C c = new C(12);
	}
}

class A
{
	public A()
	{
		super();
		System.out.println("A class");
	}
}

class B extends A
{
	public B()
	{
		super();
		System.out.println("B class");
	}
	
	public B(int a) {
		System.out.println("B class : 1 param");
	}
}

class C extends B
{
	public C()
	{
		super();
		System.out.println("C class");
	}
	
	public C(int a) {
		super(23678);
		System.out.println("C class : 1 param");
	}
}