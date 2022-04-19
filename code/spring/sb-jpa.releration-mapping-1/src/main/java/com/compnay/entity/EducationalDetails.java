package com.compnay.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "eduinfo")
public class EducationalDetails {

	@Id
	private int id;
	private String title;
	private double percent;
	@ManyToOne
	private UserDetails uid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public UserDetails getUid() {
		return uid;
	}
	public void setUid(UserDetails uid) {
		this.uid = uid;
	}
}
