public class VariableCasting 
{
	public static void main(String args[])
	{
		byte x = 10;
		int y = x;
		short z = (short) y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);


		byte a = 127;
		byte output = (byte) (a + 2); // 129    // -127
		System.out.println(output);		



	}
}