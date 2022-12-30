package com.accenture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("!------------------!");
		
//		Student student = new Student();
//		student.name = "James";
//		student.displayStudentInfo();
		
		Student student=context.getBean("student", Student.class);
		System.out.println(student);
		student.displayStudentInfo();
		
		Student st = new Student ("Daphne", "Singapore", 29);
	}
}
