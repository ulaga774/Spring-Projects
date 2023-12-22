package com.xworkz.creativity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class DbConfig {
	
	@Bean
	public LocalEntityManagerFactoryBean LocalEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean lemfb = new LocalEntityManagerFactoryBean();
		lemfb.setPersistenceUnitName("creativity");
		return lemfb;
	}
	

}