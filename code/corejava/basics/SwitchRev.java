public class SwitchRev
{
	public static void main(String args[])
	{
		char ch = 't';
		switch(ch)
		{
			case 'M':
				System.out.println("Monday");
			break;
			case 'T': case 't' :
				System.out.println("Tuesday/Thursday");
			break;
			case 'W':
				System.out.println("Wednesday");
			break;
			case 'F':
				System.out.println("Friday");
			break;
			case 'S':
				System.out.println("Saturday/Sunday");
			break;
			default: 
				System.out.println("Invalid Char....");
		}
	}
}