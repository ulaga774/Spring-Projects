package com.xworkz.train.app;

import org.springframework.stereotype.Component;

@Component
public class Cheenai implements TrainInterface {

	@Override
	public void getDurationFromSelam() {
		System.out.println("to chennai 4.4hrs");

	}

}
