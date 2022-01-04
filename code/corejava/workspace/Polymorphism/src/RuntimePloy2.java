
public class RuntimePloy2 {
	public static void main(String[] args) {
		Employee e = new Employee(121, "HR", "Abc", "789789789");
		e.showDetails();
	}
}
class Person {
	private String name;
	private String contact;
	public Person(String name, String contact) {
		this.name = name;
		this.contact = contact;
	}
	public void showDetails() {
		System.out.println("Name : " + name);
		System.out.println("Contact : " + contact);
	}
}

class Employee extends Person {
	private int id;
	private String role;
	public Employee(int id, String role, String name, String contact) {
		super(name,contact);
		this.id = id;
		this.role = role;
	}
	public void showDetails() {
		System.out.println("Id : " + id);
		System.out.println("Role : " + role);
		super.showDetails();
	}
}
