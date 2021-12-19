
/*
M -> Morning
A -> Afternoon
E -> Evening
N -> Night
*/

public class SwitchDemo {

	public static void main(String arg[]) {
		char ch = 'm';
		switch(ch) 
		{
			case 'M':
			case 'm':
				System.out.println("Morning");
				break;
			case 'A':
			case 'a':
				System.out.println("Afternoon");
				break;
			default:
				System.out.println("Invalid..");
				break;
			case 'E':
			case 'e':
				System.out.println("Evening");
				break;
			case 'N':
			case 'n':
				System.out.println("Night");
				break;
		}
	}

}
