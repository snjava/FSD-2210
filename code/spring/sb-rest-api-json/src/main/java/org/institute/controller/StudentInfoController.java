package org.institute.controller;

import java.util.ArrayList;
import java.util.List;

import org.institute.bean.Address;
import org.institute.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentInfoController {

	
	@GetMapping("/get-dummy-student")
	public Student getDummyStudent() {
		
		Address add = new Address();
		add.setCity("Pune");
		add.setState("MH");
		
		Student st = new Student();
		st.setId(1);
		st.setName("Abcd");
		st.setContact("9988778899");
		st.setAddress(add);
		return st;
	}
	
	@GetMapping("/get-dummy-student-list")
	public List<Student> getDummyStudentList() {
		
		Address add = new Address();
		add.setCity("Pune");
		add.setState("MH");
		
		Student st1 = new Student();
		st1.setId(1);
		st1.setName("Abcd");
		st1.setContact("9988778899");
		st1.setAddress(add);
		
		Student st2 = new Student();
		st2.setId(11);
		st2.setName("Xyz");
		st2.setContact("9980987654");
		st2.setAddress(add);
		
		Student st3 = new Student();
		st3.setId(8);
		st3.setName("Pqr");
		st3.setContact("9921234565");
		st3.setAddress(add);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		return list;
	}
	
	
}
