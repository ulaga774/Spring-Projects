package com.xworkz.landrecord.repositry;

import com.xworkz.landrecord.dto.LandRecordDetailsDto;

public interface EditAndDeleteRepo {

	public boolean EditByAadharNo(String ownerName, String mobileNumber, String aadharNumber, String houseNumber,
			String surveyNumber,String year, int status);

	public boolean deleteRecords(String houseNumber, String surveyNumber , int status);

	public LandRecordDetailsDto ifExists(int hosueNumber, int surveyNumber, int status);
}
