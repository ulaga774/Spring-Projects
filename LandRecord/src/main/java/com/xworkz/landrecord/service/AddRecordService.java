package com.xworkz.landrecord.service;

import org.springframework.ui.Model;

import com.xworkz.landrecord.dto.LandRecordDetailsDto;

public interface AddRecordService {

	public boolean saveRecords(LandRecordDetailsDto dto, Model model) ;
}
