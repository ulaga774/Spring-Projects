package com.xworkz.landrecord.repositry;

import org.springframework.ui.Model;

import com.xworkz.landrecord.dto.LandRecordDetailsDto;

public interface AddRecordRepo {
	

	public boolean saveRecords(LandRecordDetailsDto dto, Model model);

}
