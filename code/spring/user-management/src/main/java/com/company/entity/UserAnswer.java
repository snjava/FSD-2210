package com.company.entity;

import java.util.List;

public class UserAnswer {
	private User user; //user management
	private List<Answer> answers; // Answer Management
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
}
