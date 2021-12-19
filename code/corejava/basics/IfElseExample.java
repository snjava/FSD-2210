
/*
	create int varaible "time" set the values inside this variable.
	Print the following statement based on the time value.
	time is between 1-12 --> Good Morning
	time is between 12-16 --> Good Afternoon
	time is between 16-21 --> Good Evening
	time is between 21-24 --> Good Night

*/



public class IfElseExample
{
	public static void main(String args[])
	{
		int time = 100;
	
		if(time>=1 && time<=24) {
			if(time>=1 && time<12) {
				System.out.println("Good Morning");
			} 
			else if(time>=12 && time<16) {
				System.out.println("Good Afternoon");
			}
			else if (time>=16 && time<21) {
				System.out.println("Good Evening");
			} 
			else if(time>=21 && time<=24) {
				System.out.println("Good Night");
			}
		}		
		else {
			System.out.println("Invalid time value, Value must be between 1-24");
		}
		
	}
}