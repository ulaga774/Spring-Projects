package com.xworkz.train.app;

import org.springframework.stereotype.Component;

@Component
public class Kerala implements TrainInterface {

	@Override
	public void getDurationFromSelam() {
		System.out.println("to kerala 2.4hrs");

	}

}
