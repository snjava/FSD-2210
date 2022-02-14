import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("a@gmail.com");
		set.add("c@gmail.com");
		set.add("d@gmail.com");
		set.add("b@gmail.com");
		
		System.out.println(set);
		
	}
}
