
public class OverloadingDemo1 {
	public static void main(String[] args) {
		Addition a1 = new Addition();
		a1.add(234, 546);
		a1.add("Abc","Xyz");
	}
}

class Addition {
	public int add(int a, int b) {
		int ans = a + b;
		System.out.println("Addition of 2 int is : " + ans);
		return ans;
	}
	
	int add(int a, int b, int c) {
		int ans = a + b + c;
		System.out.println("Addition of 3 int is : " + ans);
		return ans;
	}

	protected float add(int a, float b) {
		float ans = a + b ;
		System.out.println("Addition of 3 int is : " + ans);
		return ans;
	}
	
	private float add(float a, int b) {
		float ans = a + b ;
		System.out.println("Addition of 3 int is : " + ans);
		return ans;
	}
	
	public double add(double a, double b) {
		double ans = a + b;
		System.out.println("Addition of 2 double is : " + ans);
		return ans;
	}

	public String add(String a, String b) {
		String ans = a + b;
		System.out.println("Addition of 2 String is : " + ans);
		return ans;
	}
	
	public char add(char a, char b) {
		char ans = (char)(a + b);
		System.out.println("Addition of 2 char is : " + ans);
		return ans;
	}
	
	public String add(int a, String b) {
		String str = a + b;
		return str;
	}

}
