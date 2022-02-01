package learning.map;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(121, "Abc");
		map.put(11, "Xyz");
		map.put(21, true);
		map.put(1, null);
		map.put(11, 234234);
		map.put(12, 342.43);
		System.out.println(map);
		
		
		System.out.println(map.higherKey(11)); // it will return the higher key than the given key
		System.out.println(map.higherEntry(11));// it will return the higher entry than the given key
		
		System.out.println(map.lowerKey(11)); // it will return the lower key than the given key
		System.out.println(map.lowerEntry(11));// it will return the lower entry than the given key
		
		
		System.out.println(map.ceilingKey(11)); // it will return the grater than or equal to key than the given key
		System.out.println(map.ceilingEntry(11));
		
		System.out.println(map.floorKey(11)); // it will return the less than or equal to key than the given key
		System.out.println(map.floorEntry(11));
		
		
		System.out.println(map.firstKey());
		System.out.println(map.firstEntry());
		
		System.out.println(map.lastKey());
		System.out.println(map.lastEntry());
		
	}
}









