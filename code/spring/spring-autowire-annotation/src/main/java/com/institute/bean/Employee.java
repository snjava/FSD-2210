package com.institute.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Autowired
	private Address add;
	
	public Address getAdd() {
		return add;
	}
}
