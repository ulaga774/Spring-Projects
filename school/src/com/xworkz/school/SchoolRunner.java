package com.xworkz.school;

import com.xworkz.school.dao.SthiyamSchoolDAo;
import com.xworkz.school.dao.VarunSchoolDao;
import com.xworkz.school.dto.SchoolDto;

public class SchoolRunner {

	public static void main(String[] args) {
		SchoolDto dto = new SchoolDto("Sathiyam_school", 1000, 987654l);
		SchoolDto dto1 = new SchoolDto("varun_school", 5000, 7654l);
		
		SthiyamSchoolDAo dao = new SthiyamSchoolDAo();
		dao.Save(dto);
		
	
		
		SchoolDto[] read = 	dao.read();
		for (int i = 0; i < read.length; i++) {
			if(read[i]!= null) {
				System.out.println(read[i]);	
			}
			
		}
		
		VarunSchoolDao dao1 = new VarunSchoolDao();
		dao.Save(dto1);
		
		SchoolDto[] readVarun = 	dao.read();
		for (int i = 0; i < readVarun.length; i++) {
			if(readVarun[i]!= null) {
				System.out.println(readVarun[i]);	
			}
			
		}


	}

}
