package com.xworkz.school.dao;

import com.xworkz.school.constant.SchoolAbstract;
import com.xworkz.school.dto.SchoolDto;

public class SthiyamSchoolDAo extends SchoolAbstract{
	
	SchoolDto[] dtos = new SchoolDto[5];

	@Override
	public boolean Save(SchoolDto dto) {
	if(dto != null) {
		for (int i = 0; i < dtos.length; i++) {
			if(dtos[i] == null) {
				dtos[i] = dto;
				System.out.println("saved_sathiyamSchool");
				return true;
			}
		}
	}
		return false;
	}

	@Override
	public SchoolDto[] read() {
	
		return dtos;
	}

}
