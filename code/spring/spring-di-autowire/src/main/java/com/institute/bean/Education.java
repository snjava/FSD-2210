package com.institute.bean;

public class Education {
	private String title;
	private double percent;
	public Education(String title, double percent) {
		this.title = title;
		this.percent = percent;
	}
	public String getTitle() {
		return title;
	}
	public double getPercent() {
		return percent;
	}
}
