package com.accenture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println("!------------------!");
	
		College college = context.getBean("collegeBeanDefinition", College.class);
		
		college.welcome();
	}
}
