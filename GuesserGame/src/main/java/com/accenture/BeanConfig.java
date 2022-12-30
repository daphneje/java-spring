package com.accenture;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
	@Bean()
	@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
	public Player playerBeanDefinition() {
		Player player = new Player();
		return player;
	}
	
	@Bean()
	public Guesser guesserBeanDefinition() {
		Guesser guesser = new Guesser();
		return guesser;
	}
	
	@Bean()
	public Umpire umpireBeanDefinition() {
		return new Umpire(guesserBeanDefinition(), playerBeanDefinition(), playerBeanDefinition(), playerBeanDefinition());
	}
}
