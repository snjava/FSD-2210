public class Array2D_2
{
	public static void main(String args[])
	{
		int marks[][] = {
				{34,56,78,45},
				{67,45,87,67},
				{65,43,87,43},
				{44,66,88,55},
				{67,33,89,66}
			};

		System.out.println(marks.length); // total number of rows //----> 5
		System.out.println(marks[2].length); // total number of columns of specificed row. //------> 4
		
	}
}