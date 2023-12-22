package com.xworkz.school.dao;

import com.xworkz.school.constant.SchoolAbstract;
import com.xworkz.school.dto.SchoolDto;

public class VarunSchoolDao extends SchoolAbstract {
	SchoolDto[] vdto = new SchoolDto[5];
	@Override
	public boolean Save(SchoolDto dto) {
		if(dto != null) {
			for (int i = 0; i < vdto.length; i++) {
				if(vdto[i] == null) {
					vdto[i] = dto;
					System.out.println("saved_varunSchool");
					return true;
				}
			}
		}
			return false;
		}
	@Override
	public SchoolDto[] read() {
		
		return vdto;
	}


}
