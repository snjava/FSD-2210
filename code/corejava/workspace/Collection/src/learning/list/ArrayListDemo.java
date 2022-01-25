package learning.list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(121);
		list.add("abc");
		list.add(12.23);
		list.add(121);
		list.add(121);
		list.add("abc");
		
		System.out.println(list);
		
		list.remove("abc");
		
		System.out.println(list);
		
		System.out.println(list.contains("xyz"));
		
		System.out.println(list.size());
		
		list.clear();
		
		System.out.println(list.isEmpty());
		System.out.println(list);
		
		
	}

}
