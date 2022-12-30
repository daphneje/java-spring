package com.accenture;

public class College {
	private Principal principal;
	
	public College(Principal principal) {
		this.principal = principal;
	}
	
	public void welcome() {
		System.out.println("Hello, welcome to our college");
		principal.info();
	}
}
