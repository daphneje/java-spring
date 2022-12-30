package com.accenture;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String name;
	private int number;
	private Address address;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", emp num=" + number + ", address=" + address + "]";
	}
	
	public void employeeInfor() {
		System.out.println("Employee Name -> " + name);
	}
	
}
