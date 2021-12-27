
public class ConstructorDemo {
	public static void main(String[] args) {
		Student stud1 = new Student(12, "Abc", "Pune");
		stud1.print();
		System.out.println("====================");
		Student stud2 = new Student();
		stud2.print();
		System.out.println("====================");
		Student stud3 = new Student(12, "Abc");
		stud3.print();
	}
}

class Student {
	int id;
	String name;
	String city;
	
	public Student() { // no-parameterize constructor 
		name = "NA";
		city = "NA";
	}
	
	public Student(int id, String name, String city) { // 3-parameterize constructor
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public Student(int id, String name) { // 2-parameterize constructor
		this.id = id;
		this.name = name;
		this.city = "NA";
	}
	
	public void print() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("City : " + city);
	}
}
