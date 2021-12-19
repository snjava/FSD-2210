public class Array1D_1
{
	public static void main(String args[])
	{
		int arr[] = {34,45,7,8,98,76,6};
		System.out.println(arr.length);

		for(int i = 0 ; i<= arr.length-1 ; i++) 
		{
			System.out.println(arr[i]);
		}

		System.out.println("===========================");

		for(int val : arr) 
		{
			System.out.println(val);
		}	

	}
}