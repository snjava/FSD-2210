package com.institute.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {

	@Autowired
	private Address add;
	
	public Address getAdd() {
		return add;
	}
	
}
