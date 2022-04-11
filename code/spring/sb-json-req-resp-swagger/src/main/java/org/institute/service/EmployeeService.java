package org.institute.service;

import java.util.ArrayList;
import java.util.List;

import org.institute.bean.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private List<Employee> empList = new ArrayList<Employee>();
	
	
	public void addEmployee(Employee emp) {
		empList.add(emp);
	}
	
	
	public List<Employee> getAllEmp() {
		return empList;
	}
	
	
}
