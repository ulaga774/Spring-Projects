package com.xworkz.metro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.metro.app.Service;
import com.xworkz.metro.confg.MetroConfg;

public class MetroRunner {

	public static void main(String[] args) {
		ApplicationContext con  =  new AnnotationConfigApplicationContext(MetroConfg.class);
		Service serve= con.getBean(Service.class);
		
		serve.getService();

	}

}
