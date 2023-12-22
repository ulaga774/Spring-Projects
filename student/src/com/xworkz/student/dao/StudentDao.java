package com.xworkz.student.dao;

import java.util.HashMap;

import com.xworkz.student.dto.StudentDto;

public interface StudentDao {
	public boolean save(Integer id , StudentDto dto);
	public HashMap<Integer,StudentDto > read();
	public StudentDto find(Integer id );

}
