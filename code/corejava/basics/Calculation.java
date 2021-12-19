public class Calculation
{
	public static void main(String a[])
	{	
		Calculation calculate; // reference Variable
		calculate = new Calculation(); // Object of class.

		calculate.add();
		int x= 10;
		calculate.sub(23, x);
		int ans = calculate.mul();
		System.out.println("Mul : " + ans);
		System.out.println("Div : " + calculate.div(20.0f, 3.0f));
	}

	// method to print addition of 2 numbers
	public void add()
	{	
		int num1 = 10;
		int num2 = 20;
		int ans = num1 + num2;
		System.out.println("Add : " + ans);
	}

	// method which accept 2 int value print sub. of those numbers
	public void sub(int a, int b)
	{
		int ans = a-b;
		System.out.println("Sub : " + ans);
		return;
	}
	

	// method which return the mul. of 2 numbers
	public int mul()
	{
		int num1 = 10;
		int num2 = 5;
		int ans = num1 * num2;
		return ans;
	}

	// method which accept 2 float value return div. of those numbers
	public double div(float a, float b) 
	{
		return (a/b);
	}
}