public class FindTheSquare
{
	public static void main(String args[]) 
	{
		System.out.println("This is a main Method");

		FindTheSquare sq; // reference variable
		sq = new FindTheSquare(); // object/instance class		
		int ans = sq.square(12);
		System.out.println("Square is : " + ans);	
	}
	
	public int square(int num)
	{
		System.out.println("This is a square Method");
		int ans = num * num;
		return ans;
	}
}