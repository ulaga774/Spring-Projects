package com.xworkz.metro.app;

import org.springframework.stereotype.Component;

@Component("ban")
public class BangalorMetro implements ElectricMetroInterface{

	@Override
	public void getTicketForElectric() {
		System.out.println("ele for 500 bangalore");
		
	}

}
