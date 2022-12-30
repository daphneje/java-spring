package com.accenture;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	@Bean("address")
	public Address addressBean() {
		Address address = new Address();
		return address;
	}
}
