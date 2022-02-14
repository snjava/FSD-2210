

// throw: use to throw exception manually. It throws Object of Exception
// throws: use to propagate the exception out method at caller level. 

public class ThrowThrows {

	public static void main(String[] args)throws InvalidNumber {
		System.out.println(getSquare(-2));
	}

	public static int getSquare(int num) throws InvalidNumber {
		if(num<=0)
		{	
			throw new InvalidNumber();
		}
		
		int square = num * num;
		return square;
	}
}

class InvalidNumber extends Exception
{
}





















