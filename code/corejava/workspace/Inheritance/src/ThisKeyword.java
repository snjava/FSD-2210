public class ThisKeyword {
	public static void main(String[] args) {
		Demo d = new Demo(30);
		d.print(23);
	}
}
class Super
{
	int a = 30;
	public Super() {
		System.out.println("Super No-Param");
	}
}
class Demo extends Super
{
	int a= 10;
	public Demo() {
		System.out.println("Demo No-param");
	}
	public Demo(int a) {
		this(); // Can access a constructor of same class.
		System.out.println("Demo 1-param");
	}
	public void print(int a) {
		System.out.println("a : " + a);  // 23
		System.out.println("this.a : " + this.a); // 10
		System.out.println("super.a : " + super.a); // 30
	}
}
