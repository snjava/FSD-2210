
public class SingleInheritance {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.printData();
	}
}

class Parent 
{
	int a = 10;
	public int b = 20;
	protected int c = 30;
	private int d = 40; 
}

// Child IS-A Parent
class Child extends Parent
{
	public void printData()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
