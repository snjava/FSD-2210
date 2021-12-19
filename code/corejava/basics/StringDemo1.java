public class StringDemo1
{
	public static void main(String arg[])
	{
		String str1 = new String("Hello"); // String object with new Operator.
		String str2 = "Hello"; // String Object without new Operator.
		String str3 = new String("Hello");
		String str4 = "Hello";	
	
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println(str2 == str4);
		System.out.println(str1 == "Hello"); // false
		System.out.println(str2 == "Hello"); // true
		System.out.println(str2 == "HELLO"); // false
	}
}