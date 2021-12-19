public class Array1D
{
	public static void main(String args[])
	{
		int marks[]; // declaration

		marks = new int[5]; // instance of array
		
		marks[0] = 55; // Initialization of Array
		marks[1] = 88;
		marks[2] = 76;

		System.out.println(marks); // [I@762efe5d (HashCode: memory repsentation of an object)

		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);

	}
}
