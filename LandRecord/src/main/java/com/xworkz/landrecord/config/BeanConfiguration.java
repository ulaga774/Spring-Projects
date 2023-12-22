package com.xworkz.landrecord.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.landrecord")
@EnableWebMvc
public class BeanConfiguration implements WebMvcConfigurer {

	public BeanConfiguration() {
		System.out.println("this is Bean Configuration");
	}

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver view = new InternalResourceViewResolver("/", ".jsp");
		return view;

	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "index.jsp");

	}

}