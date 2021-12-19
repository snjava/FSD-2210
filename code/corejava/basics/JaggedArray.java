public class JaggedArray
{
	public static void main(String args[])
	{

		int marks[][] = { {23,56}, {34,56,87,43,23}, {23,45,43} };
		
		for(int val[] : marks) {
			for(int num : val) {
				System.out.print(num + "\t");
			}
			System.out.println();
		} 

	}
}
