package com.xworkz.metro.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Service {
	@Autowired
	@Qualifier("chennaiMetro")
	private ElectricMetroInterface electric;

	@Autowired
	@Qualifier("HarurMetro")
	private FuleMetroInterface fule;

	public void getService() {

		electric.getTicketForElectric();

		fule.getTicketForFule();

	}

}
