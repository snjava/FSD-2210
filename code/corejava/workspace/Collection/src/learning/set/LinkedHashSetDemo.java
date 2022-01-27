package learning.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
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
