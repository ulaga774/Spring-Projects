package com.xworkz.student.dao;

import java.util.HashMap;

import com.xworkz.student.dto.StudentDto;

public class StudentDaoImpl implements StudentDao {
	HashMap<Integer, StudentDto> map = new HashMap<Integer, StudentDto>();

	@Override
	public boolean save(Integer id, StudentDto dto) {

		map.put(id, dto);
		System.out.println("saved");

		return true;
	}

	@Override
	public HashMap<Integer, StudentDto> read() {

		return map;
	}

	@Override
	public StudentDto find(Integer id) {

		return map.get(id);
	}

}
