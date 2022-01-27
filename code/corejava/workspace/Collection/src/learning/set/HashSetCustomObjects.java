package learning.set;

import java.util.HashSet;

public class HashSetCustomObjects {
	public static void main(String[] args) {
		Student s1 = new Student(1, "A");
		Student s2 = new Student(2, "B");
		Student s3 = new Student(3, "C");
		Student s4 = new Student(4, "D");
		Student s5 = new Student(2, "B");
		
		HashSet set = new HashSet();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		System.out.println(set);
	}
}

class Student {
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void print() {
		System.out.println(" Id : " + id + " | Name : "+ name);
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if(id == s.id) {
			return true;
		}else {
			return false;	
		}
	}
}







