
public class MultilevelInheritance {
	public static void main(String[] args) {
		Z z = new Z();
		z.print();
	}
}
class X
{
	int a = 10;
	public void fromX() {
		System.out.println("a = " + a);
	}
}

class Y extends X
{
	int b = 20;
}

class Z extends Y
{
	int c = 30;
	public void print() {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		fromX();
	}
}