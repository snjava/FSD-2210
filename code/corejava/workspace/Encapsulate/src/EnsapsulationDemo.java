public class EnsapsulationDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(121);
		e1.setName("abcd");
		e1.setContact("1234567891");
		printDetails(e1);
	}
	public static void printDetails(Employee e) {
		System.out.println("Id : " + e.getId());
		System.out.println("Name : " + e.getName());
		System.out.println("Contact : " + e.getContact());
	}
}
// bean, entity, dto, domain, model
class Employee {
	private int empId;
	private String name;
	private String contact;
	public int getId() {
		return empId;
	}
	public void setId(int id) {
		this.empId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		if(contact.length() == 10 ) {
			this.contact = contact;
		}else {
			System.err.println("Invalid Contact Number...");
			System.exit(0);
		}
	}
	
	
}












