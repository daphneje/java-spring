package com.accenture;

public class Student {
	private String name;
	private String address;
	private int age;
	
	public void displayStudentInfo() {
		System.out.println("Student Name=" + name);
	}
	
	// Constructor Based Injection

	public Student(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	// Setter Based Injection
	
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}
	
	// Setter Based Injection
	
	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	
	
}
