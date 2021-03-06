package com.compnay.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "userinfo")
public class UserDetails {

	@Id
	private int id;
	private String name;
	private String email;
	@OneToOne
	private AddressDetails aid;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AddressDetails getAid() {
		return aid;
	}
	public void setAid(AddressDetails aid) {
		this.aid = aid;
	}
}
