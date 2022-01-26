package learning.list;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(123);
		list.add(321);
		
		System.out.println(list);
		
		list.add(1, 200);
		list.add(0, 500);
		
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		System.out.println(list.get(1));
		
		list.set(1, 400);
		System.out.println(list);
		
	}
}
