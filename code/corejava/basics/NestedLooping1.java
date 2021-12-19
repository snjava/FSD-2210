/*
	1 1 1 1 1
	2 2 2 2 2
	3 3 3 3 3
	4 4 4 4 4
*/


public class NestedLooping1
{
	public static void main(String args[])
	{	
		for (int r = 1; r<=4 ; r++)
		{
			for (int c = 1 ; c<=5 ; c++)
			{
				System.out.print(r + "\t");
			}
			System.out.println();	
		}
	}
}