package com.xworkz.metro.app;

import org.springframework.stereotype.Component;

@Component("HarurMetro")
public class HarurMetro implements FuleMetroInterface{

	@Override
	public void getTicketForFule() {
		System.out.println("fule for 400 harur");
		
	}

}
