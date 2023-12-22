package com.xworkz.landrecord.service;

import org.springframework.ui.Model;

import com.xworkz.landrecord.dto.LandRecordDetailsDto;

public interface EditAndDeleteService {

	public boolean EditByAadharNo(String ownerName, String mobileNumber, String aadharNumber, String houseNumber,
			String surveyNumber,String year, Model model);

	public boolean deleteRecords(String houseNumber, String surveyNumber, Model model);

	public LandRecordDetailsDto ifExists(int houseNumber, int surveyNumber, Model model);

}
