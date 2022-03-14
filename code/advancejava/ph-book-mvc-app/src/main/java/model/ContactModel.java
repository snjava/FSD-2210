package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	
	
	public List<Contact> getAll() {
		ArrayList<Contact> list = new ArrayList<Contact>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd22nov","root","root");
			PreparedStatement pstmt = con.prepareStatement("select * from contact");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Contact c = new Contact();
				c.setId(rs.getInt("id"));
				c.setFname(rs.getString("fname"));
				c.setLname(rs.getString("lname"));
				c.setMobNum(rs.getString("contact"));
				list.add(c);
			}
			rs.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
