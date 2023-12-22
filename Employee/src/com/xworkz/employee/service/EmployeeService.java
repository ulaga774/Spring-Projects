package com.xworkz.employee.service;


import java.util.List;


import com.xworkz.employee.dto.EmployeeDto;

public interface EmployeeService {
	public boolean save(EmployeeDto dto);
	public EmployeeDto findByName(String name);
	public EmployeeDto findByNameAndLocation(String companyName , String Location);
	public boolean updateNameByid(int id , String name);
	public boolean updateSysmbolByLocationAndZipcode( String locatio ,int zipcode , char symbol);
	public boolean deleteByRating(float rating );
	public boolean deleteByLocationAndName(String location,String name );
	public List<EmployeeDto> readAll();


}
