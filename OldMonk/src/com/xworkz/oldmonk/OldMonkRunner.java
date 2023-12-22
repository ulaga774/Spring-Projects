package com.xworkz.oldmonk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.oldmonk.config.AppConfig;
import com.xworkz.oldmonk.dto.OldMonkDto;
import com.xworkz.oldmonk.service.OldMonkService;
import com.xworkz.oldmonk.service.OldMonkServiceImpl;

public class OldMonkRunner {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		OldMonkService service = context.getBean(OldMonkServiceImpl.class);
		OldMonkDto dto = new OldMonkDto(2, "brandy", 280, 375, 49);
		boolean save = service.save(dto);
		System.out.println(save);

	}

}
