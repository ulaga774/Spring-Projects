package com.xworkz.spotify.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {BeanConfiguration.class} ;
	}

	@Override
	protected String[] getServletMappings() {
		String[] str = {"/"};
		return str;
	}

}
