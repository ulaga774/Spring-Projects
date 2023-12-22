package com.xworkz.student.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class StudentDto {
	
	private String name;
	private int registerNumber;
	private int age;
	private String qualification;
	private String place;
	
	

}
