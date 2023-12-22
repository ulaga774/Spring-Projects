package com.xworkz.laptop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Controller
@Configuration
@ComponentScan("com.xworkz.laptop")
public class BeanConfig implements WebMvcConfigurer{

	public BeanConfig() {
		System.out.println("bean config");
	}
	public viewResolver ViewResolver() {
		return register;
		
	}
}
