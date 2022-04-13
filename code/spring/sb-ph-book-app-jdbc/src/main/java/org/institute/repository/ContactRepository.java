package org.institute.repository;

import org.institute.bean.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ContactRepository {
	
	@Autowired
	private JdbcTemplate template;
	
	public int saveContact(Contact c) {
		Object val[] = {c.getFname(), c.getLname(), c.getContact()};
		return template.update("insert into contact values(0,?,?,?)", val);
	}
	
	public int updateContact(Contact c) {
		Object val[] = {c.getFname(), c.getLname(), c.getContact(), c.getId()};
		return template.update("update contact set fname=?, lname=?, contact=? where id=?", val);
	}
	
	public int deleteContact(int id) {
		return template.update("delete from contact where id=?", id);
	}
	
	
}
