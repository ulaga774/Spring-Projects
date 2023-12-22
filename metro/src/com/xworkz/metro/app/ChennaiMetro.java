package com.xworkz.metro.app;

import org.springframework.stereotype.Component;

@Component("chennaiMetro")
public class ChennaiMetro implements ElectricMetroInterface{

	@Override
	public void getTicketForElectric() {
		System.out.println("ele for 200 chennai");
	}

}
