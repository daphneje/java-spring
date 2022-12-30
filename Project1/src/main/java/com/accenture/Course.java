package com.accenture;

public class Course {
	private String module;

	public Course(String module) {
		super();
		this.module = module;
	}

	@Override
	public String toString() {
		return "Course [module=" + module + "]";
	}
	
	public String getLocation() {
		return module;
	}
	
}
