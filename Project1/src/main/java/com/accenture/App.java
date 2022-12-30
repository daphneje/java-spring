package com.accenture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Trainer trainer=context.getBean("trainer", Trainer.class);
		System.out.println(trainer);
		trainer.info();

	}
}
