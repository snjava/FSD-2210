package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import dto.Contact;

public class ContactModel {

	public boolean saveContact(Contact ct) {
		boolean result = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd22nov","root","root");
			PreparedStatement pstmt = con.prepareStatement("insert into contact values(0,?,?,?)");
			pstmt.setString(1, ct.getFname());
			pstmt.setString(2, ct.getLname());
			pstmt.setString(3, ct.getMobNum());
			int count = pstmt.executeUpdate();
			result = count>0;
			pstmt.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
}
