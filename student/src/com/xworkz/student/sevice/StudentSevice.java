package com.xworkz.student.sevice;

import java.util.HashMap;

import com.xworkz.student.dto.StudentDto;

public interface StudentSevice {
	
	public boolean save(Integer id , StudentDto dto);
	public HashMap<Integer,StudentDto > read();
	public StudentDto find(Integer id);
	

}
