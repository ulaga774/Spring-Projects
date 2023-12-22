package com.xworkz.metro.app;

import org.springframework.stereotype.Component;

@Component("selam")
public class SalemMetro implements FuleMetroInterface{

	@Override
	public void getTicketForFule() {
		System.out.println("fule for 300 salem");
		
	}

}
