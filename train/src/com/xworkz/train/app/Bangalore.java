package com.xworkz.train.app;

import org.springframework.stereotype.Component;

@Component
public class Bangalore implements TrainInterface {

	@Override
	public void getDurationFromSelam() {
		System.out.println("to bangalore 5.4hrs");

	}

}
