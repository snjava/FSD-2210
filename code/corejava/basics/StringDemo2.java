public class StringDemo2
{
	public static void main(String arg[])
	{
		String s1 = "Hello Program";
		String s2 = new String("Hello");
		String s3 = new String("HELLO");
		String s4= "" ;
		String s5= "        " ;

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
			
		System.out.println(s1.charAt(1)); // e
		System.out.println(s1.indexOf('o', 6)); // 4
		System.out.println(s1.lastIndexOf('o')); // 8

		System.out.println(s2.length()); // 5
		System.out.println(s2.isEmpty()); // false
		System.out.println(s4.isEmpty()); // true
		System.out.println(s5.isBlank()); // true (JDK 11 aand Above)

		
		
	}
}