package learning.set;

import java.util.HashSet;

public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(123);
		set.add("abc");
		set.add(12.34);
		set.add(123);
		set.add("abc");
		set.add("xyz");
		set.add('A');
		System.out.println(set);
	}
}
