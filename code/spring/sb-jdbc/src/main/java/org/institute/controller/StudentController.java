package org.institute.controller;

import org.institute.bean.Student;
import org.institute.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository repository;
	
	@PostMapping("/save-student")
	public String saveStudent(@RequestBody Student stud) {
		int count = repository.saveStudent(stud);
		if(count>0) {
			return "Student Save Successfully";
		} else {
			return "Student Save Failed";
		}
	}
	
	
	
}
