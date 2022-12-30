package com.accenture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println("!------------------!");
	
		Address address=context.getBean("address", Address.class);
		System.out.println(address); 

		Employee employee=context.getBean("employee", Employee.class);
		System.out.println(employee);
	}
}
