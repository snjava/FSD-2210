package com.institute.bean;

public class Question {
	private int id;
	private String title;
	private Answer ans;
	
	public Question(Answer ans, int id, String title) {
		this.id = id;
		this.title = title;
		this.ans = ans;
	}
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
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}
}
