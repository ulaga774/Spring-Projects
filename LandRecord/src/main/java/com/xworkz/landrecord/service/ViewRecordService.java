package com.xworkz.landrecord.service;

import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.landrecord.dto.LandRecordDetailsDto;

public interface ViewRecordService {
	
	public List<LandRecordDetailsDto> readBYVillage(String taluk, String hobli, String village ,Model model);

}
