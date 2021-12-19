import java.util.StringTokenizer;
public class StringTokenizerDemo1
{
	public static void main(String arg[])
	{
		StringTokenizer str = new StringTokenizer("15/12/2021-1-Pune","-");
		System.out.println(str.countTokens());
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
	}
}