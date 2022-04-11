package org.institute.controller;

import org.institute.bean.Employee;
import org.institute.bean.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	// Create a REST Endpoint/API to accept the Employee info and add Object of Employee into List
	//http://localhost:8080/employee-save
	@PostMapping("/employee-save")
	public String saveEmployee(@RequestBody Employee emp) {
		System.out.println("Id : " + emp.getId());
		System.out.println("Name : " + emp.getName());
		System.out.println("Email : " + emp.getEmail());
		System.out.println("City : " + emp.getAdd().getCity());
		System.out.println("State : " + emp.getAdd().getState());
		return "Employee Created Sucessfully";
	}
	
	@PostMapping("/student-save")
	public String saveStudent(@RequestBody Student stud) {
		System.out.println("Id : " + stud.getId());
		System.out.println("Name : " + stud.getName());
		System.out.println("Email : " + stud.getEmail());
		return "Student Created Sucessfully";
	}
	
	
	// Create a REST Endpoint/API to return the list Employee
	
}
