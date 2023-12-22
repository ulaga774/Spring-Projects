package com.xworkz.student.sevice;

import java.util.HashMap;

import com.xworkz.student.dao.StudentDaoImpl;
import com.xworkz.student.dto.StudentDto;

public class StudentServiceImpl implements StudentSevice {

	StudentDaoImpl dao = new StudentDaoImpl();

	@Override
	public boolean save(Integer id, StudentDto dto) {
		if (dto != null) {
			if (dto.getName() != null && dto.getName().length() < 10) {
				if (dto.getPlace() != null) {
					System.out.println("validate sueccsfully");
					dao.save(id, dto);
					return true;

				}

			}
			System.out.println("getName is null or give valied length");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public HashMap<Integer, StudentDto> read() {

		return dao.read();
	}

	@Override
	public StudentDto find(Integer id) {
		if (id != null) {

			return dao.find(id);

		}
		return null;
	}

}
