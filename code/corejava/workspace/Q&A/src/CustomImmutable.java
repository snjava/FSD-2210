
public class CustomImmutable {
	public static void main(String[] args) {
		Person p = new Person("Abc");
		System.out.println(p.getName());
	}
}


final class Person
{
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
