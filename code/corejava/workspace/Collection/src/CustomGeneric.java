import java.util.ArrayList;
public class CustomGeneric {
	public static void main(String[] args) {
		Employee e1 = new Employee(12, "Abcd", 435345.43, 'M');
		Employee e2 = new Employee(321, "Xyz", 545345.43, 'F');
		Employee e3 = new Employee(432, "Lmn", 564345.43, 'M');
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

	}
}
class Employee {
	private int id;
	private String name;
	private double salary;
	private char gender;

	public Employee(int id, String name, double salary, char gender) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}
}