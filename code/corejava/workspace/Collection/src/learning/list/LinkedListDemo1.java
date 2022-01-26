package learning.list;

import java.util.LinkedList;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add(123);
		list.add("Abc");
		list.add(1.23);
		
		
		list.addFirst('A');
		list.addLast('Z');
		
		System.out.println(list); // [A, 123, Abc, 1.23, Z]
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list); // [123, Abc, 1.23]
		
		
		list.push(111); // is use to add element at the first place of the LinkedList
		System.out.println(list); // [111, 123, Abc, 1.23]
		
		// is use to select/get first element and also removes the last element, 
		// if first element is not present then it will throw an NoSuchElementException
		System.out.println("Pop : "+list.pop()); // 111
		System.out.println(list); // [123, Abc, 1.23]
		
		// is use to get the first element, it will remove the first element, 
		// if first element is not found then return null, can use pollFirst() and pollLast()
		System.out.println("poll : "+ list.poll()); // 123
		System.out.println(list); // [Abc, 1.23]
		
		// is use to get the first element, it will not remove the first element, 
		// if first element is not found then return null, can use peekFirst() and peekLast()
		System.out.println("peek : "+list.peek()); // Abc
		System.out.println(list); // [Abc, 1.23]
		
		
		
	}
}
