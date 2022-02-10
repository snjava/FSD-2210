import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertUserData {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Employee Id :");
			int id = scan.nextInt();
			System.out.println("Enter Employee Name :");
			String name = scan.next();
			System.out.println("Enter Employee salary :");
			double salary = scan.nextDouble();
			scan.close();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd22nov","root","root");
			PreparedStatement stmt = con.prepareStatement("insert into employee values(?,?,?,1)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setDouble(3, salary);
			//stmt.setDate(4, new Date(System.currentTimeMillis()));
			int count = stmt.executeUpdate();
			stmt.close();
			con.close();
			
			System.out.println(count + " : row inserted...");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}













