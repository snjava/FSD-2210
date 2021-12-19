public class StringDemo3
{
	public static void main(String arg[])
	{
		String s1 = "Hello String";
		String s11 = " in Java";

		System.out.println(s1);
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		System.out.println(s1.toLowerCase());

		String s3 = s1.concat(s11);  // Hello String in Java
		System.out.println(s3);
		System.out.println(s1 + s11);

		System.out.println(s3.substring(13));
		System.out.println(s3.substring(6,9));

		String s4 = "Java Program, String in Java";
		System.out.println(s4);
		System.out.println(s4.replaceFirst("Java", "C++"));
		
		System.out.println(s4.contains("C++"));

		String fileName = "coreJava-notes.pdf";
		System.out.println(fileName.endsWith(".jpeg"));
		System.out.println(fileName.startsWith("core"));

		String s5 = "welcome";
		System.out.println(s5);
		char ch[] = s5.toCharArray();
		for (int index = ch.length-1 ; index>=0 ; index--) {
			System.out.print(ch[index]);
		}
		System.out.println();


		String s6 = "Program in String";
		System.out.println(s6);
		// String in Program
		String array[] = s6.split(" ");
		for (int index = array.length-1 ; index>=0 ; index--) {
			System.out.print(array[index] + " ");
		}
		
	}
}