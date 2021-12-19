/*
	Create a int weekDay variable 
	Print "Working day" for 1,2,3,4,5
	Print "Weekend day" for 6,7
	For other numbers print "Invalid Day"

*/
public class SwitchDemo2 {
	public static void main(String args[])
	{
		long weekDay = 3;
		switch(weekDay)
		{
			case 1: 
			case 2: 
			case 3: 
			case 4: 
			case 5:
				System.out.println("It's a Working Day...");
				break;
			case 6: 
			case 7:
				System.out.println("It's a Weekend Day...");
				break;	
			default:
				System.out.println("Invalid Day..");

		}
	}
}