package com.xworkz.landrecord.repositry;

import java.util.List;

import com.xworkz.landrecord.dto.LandRecordDetailsDto;

public interface ViewRecordRepo {
	
	public List<LandRecordDetailsDto> readBYVillage(String taluk,String hobli,String village,int status);
	
	
	

}
