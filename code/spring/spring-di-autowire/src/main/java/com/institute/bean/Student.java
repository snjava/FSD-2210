package com.institute.bean;

public class Student {
	private int id;
	private String name;
	private Address add;
	private Education edu;
	public Student(int id, String name, Address add, Education edu) {
		this.id = id;
		this.name = name;
		this.add = add;
		this.edu = edu;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address getAdd() {
		return add;
	}
	public Education getEdu() {
		return edu;
	}
}
