/*
	store 3 student 5 subject marks 

*/

public class Array2D_1
{
	public static void main(String args[])
	{
		int marks[][]; // declaration
		marks = new int[3][5]; // Instance
		marks[1][1] = 60; // inititalize
		marks[1][3] = 80;

		for(int r = 0 ; r<=2 ; r++ ) {  // row
			for(int c=0 ; c<=4 ; c++) {  // column
				System.out.print(marks[r][c] + "\t");
			}
			System.out.println();
		}

		System.out.println("=========================");
		
		for(int r[] : marks) { // row
			for(int c : r) {  // column
				System.out.print(c + "\t");
			}
			System.out.println();
		}
		
	}
}