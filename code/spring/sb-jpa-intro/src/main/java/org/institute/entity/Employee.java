package org.institute.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity // This class will linked with the table in the Database
@Table(name = "empinfo") // to set the custom name of the table, by default class name will be a table name
public class Employee {
	
	@Id // Is use to make any column as a primary key.
	@GeneratedValue(strategy = GenerationType.AUTO) // to make primary key auto increment
	private int empId;
	@Column(name = "empname", length = 20, nullable = false) // is use to manage the column properties like name, constraints, size of the column
	private String name;
	@Column(name = "mobno",  unique = true, length = 10)
	private String contact;
	private double salary;
	private boolean isActive;
	@Temporal(TemporalType.DATE) // is only use for a Date type of variable to specify the data type at SQL side
	private Date dob;
	@Transient // use to avoid column for this variable
	private int age;
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
