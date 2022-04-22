package com.company.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "ans")
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String details;
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createdts;
	private String status;
	@ManyToOne(fetch = FetchType.LAZY)
	private User uid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getCreatedts() {
		return createdts;
	}
	public void setCreatedts(Date createdts) {
		this.createdts = createdts;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public User getUid() {
		return uid;
	}
	public void setUid(User uid) {
		this.uid = uid;
	}
	
}
