public class SuperKeyword {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.execute();
	}
}

class Test1
{
	int a = 10;
	public void print() {
		System.out.println("a from Test1 : " + a);
	}
}

class Test2 extends Test1
{
	int a = 20;
	public void print() {
		System.out.println("a from Test2 : " + a);
	}
	
	public void execute() {
		System.out.println("a : " + a);
		System.out.println("a : " + super.a);
		super.print();
	}
}