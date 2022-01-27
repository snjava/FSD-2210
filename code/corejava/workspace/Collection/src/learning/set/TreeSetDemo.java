package learning.set;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("Abc");
		set.add("Xyz");
		set.add("Pqr");
		set.add("Lmn");
		set.add("Zyx");
		set.add("Rpq");
		set.add("Abc");
		System.out.println(set);
	}
}
