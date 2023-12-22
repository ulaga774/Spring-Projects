package com.xworkz.train.app;

import org.springframework.stereotype.Component;

@Component
public class Hevan implements TrainInterface {

	@Override
	public void getDurationFromSelam() {
		System.out.println("to tomorrow 5pm");

	}

}
