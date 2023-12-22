package com.xworkz.railways.service;

import com.xworkz.railways.dto.RailwaysDto;
import com.xworkz.railways.repositry.RailwaysRepositry;
import com.xworkz.railways.repositry.RailwaysRepositryImpl;

public class RailwaysServiceImpl implements RailwaysService{

	RailwaysRepositry repo = new RailwaysRepositryImpl();
	@Override
	public boolean save(RailwaysDto dto) {
		
		if(dto!= null) {
			System.out.println("data saved");
			return repo.save(dto);
		}
	
		return false;
	}
	
	
		
	

}
