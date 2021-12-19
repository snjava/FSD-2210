
public class EmployeeInfo
{
	public static void main(String args[])
	{
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.id = 121;
		emp1.salary = 23223.34;
		emp1.gender = 'M';

		emp2.salary = 11111.11;
		emp2.gender = 'F'; 
		
		emp1.printEmployeeDetails();
	}
}


class Employee
{
	int id;
	double salary;
	char gender;
	public void printEmployeeDetails()
	{
		int id = 30;
		System.out.println("Id : " + this.id); // this is points to a current class Object
		System.out.println("Salary : " + salary);
		System.out.println("Gender : " + gender);
	}
}