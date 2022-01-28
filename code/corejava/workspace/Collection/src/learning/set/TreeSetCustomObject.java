package learning.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCustomObject {
	public static void main(String[] args) {
		Product p1 = new Product(12, "SmartWatch", 23003);
		Product p2 = new Product(34, "SmartPhone", 21000);
		Product p3 = new Product(21, "SmartTV", 53003);
		Product p4 = new Product(343, "Pendrive", 600);
		Product p5 = new Product(12, "SmartWatch", 23003);
		
		SortById sortId = new SortById();
		SortByPrice sortPrice = new SortByPrice();
		
		TreeSet set = new TreeSet(sortPrice);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);

		System.out.println(set);
	}
}

class Product{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]\n";
	}
}

/*
class Product implements Comparable<Product>{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]\n";
	}
	@Override
	public int compareTo(Product o) {
		if(price > o.price) {
			return 1;
		}else if(price < o.price) {
			return -1;
		}else {
			return 0;
		}
	}
}
*/

class SortById implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		if(o1.id > o2.id) {
			return 1;
		}else if(o1.id < o2.id) {
			return -1;
		}else {
			return 0;
		}
	}
}

class SortByPrice implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		if(o1.price > o2.price) {
			return 1;
		}else if(o1.price < o2.price) {
			return -1;
		}else {
			return 0;
		}
	}
}






















