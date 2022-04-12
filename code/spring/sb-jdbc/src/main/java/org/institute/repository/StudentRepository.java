package org.institute.repository;

import org.institute.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//jdbcTemplate.update(sql); // equivalent to executeUpdate in JDBC
	//jdbcTemplate.query(sql); // equivalent to executeQuery in JDBC
	
	public int saveStudent(Student stud) {
		String sql = "insert into student values(?,?,?)";  // parameterized query
		//return jdbcTemplate.update(sql, stud.getId(), stud.getName(), stud.getEmail()); // pass the value of all parameter separated by comma(,) 	
		Object data[] = {stud.getId(), stud.getName(), stud.getEmail()};
		return jdbcTemplate.update(sql, data);
	}

}
