package com.accenture;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	@Bean("principal")
//	@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
	public Principal principalBeanDefinition() {
		Principal principal = new Principal();
		return principal;
	}
	
	@Bean()
	public College collegeBeanDefinition() {
		return new College(principalBeanDefinition());
	}
}
