package com.accenture;

public class Trainer {
	private String name;
	private String session;
	private Course course;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", session=" + session + ", course=" + course + "]";
	}
	
	public void info() {
		System.out.println("Trainer: " + name);
	}
	
}
