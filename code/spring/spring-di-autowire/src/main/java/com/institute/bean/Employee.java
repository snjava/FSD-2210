package com.institute.bean;

// IS-A : Inherit property of Parent into Child
// HAS-A : Object of one class into another

public class Employee {
	private int id;
	private String name;
	private Address addr; // HAS-A (DI)
	private Education higherEdu; // HAS-A (DI)
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Education getHigherEdu() {
		return higherEdu;
	}
	public void setHigherEdu(Education higherEdu) {
		this.higherEdu = higherEdu;
	}
}
