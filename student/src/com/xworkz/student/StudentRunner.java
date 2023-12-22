package com.xworkz.student;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import com.xworkz.student.dto.StudentDto;
import com.xworkz.student.sevice.StudentServiceImpl;
import com.xworkz.student.sevice.StudentSevice;

public class StudentRunner {

	public static void main(String[] args) {
		StudentDto dto = new StudentDto("ulaga", 001, 22, "Mechanical", "tamilnadu");
		StudentDto dto1 = new StudentDto("mass", 002, 23, "EEE", "tamilnadu");
		StudentDto dto2 = new StudentDto("kiran", 003, 24, "bsc", "karnataka");
		StudentDto dto3 = new StudentDto("shuheb", 004, 28, "Mechanical", "ashan");

		StudentSevice service = new StudentServiceImpl();

		service.save(1, dto);
		service.save(2, dto1);
		service.save(3, dto2);
		service.save(4, dto3);
//		Comparator<StudentDto> comp = new Comparator<StudentDto>() {
//
//			@Override
//			public int compare(StudentDto dto1, StudentDto dto2) {
//				if (dto1.getRegisterNumber() < dto2.getRegisterNumber()) {
//					return 1;
//				}
//
//				return -1;
//			}
//
//		};
//		Collections.sort(service, comp);

		HashMap<Integer, StudentDto> read = service.read();
		Set<Integer> set = read.keySet();
		for (Object key : set) {
			System.out.println(read.get(key));

		}
		System.out.println("-------find--------");

		StudentDto find = service.find(1);
		System.out.println(find);

	}

}
