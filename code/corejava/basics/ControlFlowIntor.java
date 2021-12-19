public class ControlFlowIntor 
{
	public static void main(String args[])
	{
		int time = 10;

		if (time>=1 && time<=24) 
		{
			System.out.println("Good Morning"); // 1 - 12
			System.out.println("Good Afternoon"); // 12 - 16
			System.out.println("Good Evening"); // 16 - 21
			System.out.println("Good Night"); // 21 - 24
		}
		else 
		{
			System.out.println("You entered an Invalid Time value....");
		}

		

	}
}