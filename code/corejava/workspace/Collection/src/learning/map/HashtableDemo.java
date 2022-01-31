package learning.map;

import java.util.Hashtable;

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable map = new Hashtable();
		map.put("Abc", 12123);
		map.put(234.23, "xyz");
		map.put("Abc", 'z');
		map.put("Pqr", 12.123);
		map.put('z', 12123);
		map.put(true, 12123);
		//map.put(null, 12123);
		//map.put("xyz", null);
		//map.put(true, null);
		
		System.out.println(map);
		
		map.remove("Abc"); // remove a single entry which has matching key
		//map.remove("Abc", 'z'); // remove a single entry which has matching key and value
		
		System.out.println(map);
		
		System.out.println(map.get('z'));
		
		System.out.println(map.containsValue(12.123)); // true
		System.out.println(map.containsKey(12123)); // false
		
		System.out.println(map.size());
		
		map.clear();
		System.out.println(map);
		System.out.println(map.isEmpty());
		
		
	}
}
