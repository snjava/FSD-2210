public class StringBuilderDemo1
{
	public static void main(String arg[])
	{
		StringBuilder builder = new StringBuilder("Hello");
		System.out.println(builder);
		builder.append(" Program");
		System.out.println(builder);
		builder.insert(5, " Java");
		System.out.println(builder);
		builder.replace(6,10,"CPP");
		System.out.println(builder);
		builder.reverse();
		System.out.println(builder);
	}
}