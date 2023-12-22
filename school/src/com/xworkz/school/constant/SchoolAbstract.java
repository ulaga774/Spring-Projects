package com.xworkz.school.constant;

import com.xworkz.school.dto.SchoolDto;

public abstract  class SchoolAbstract {
	
	public abstract boolean Save(SchoolDto dto);
		
	public abstract SchoolDto[] read();
		
	

}
