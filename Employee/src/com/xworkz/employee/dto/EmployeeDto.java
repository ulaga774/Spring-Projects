package com.xworkz.employee.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_info")
@Entity
@NamedQuery(name = "find", query = "Select dto from EmployeeDto dto where dto.companyName=:nm")
@NamedQuery(name = "findByNameandLocation", query = "Select dto from EmployeeDto dto where dto.companyName=:cn and dto.location=:l")
@NamedQuery(name = "updateType", query = "update EmployeeDto dto set dto.companyName=:n where dto.id=:i")
@NamedQuery(name = "update", query = "update EmployeeDto dto set dto.symbol=:s"
		+ " where dto.location=:lo and dto.zipcode=:z")
@NamedQuery(name = "delete", query = "delete from EmployeeDto dto where dto.rating=:r")
@NamedQuery(name = "deleteLocationAndName", query = "delete from EmployeeDto dto where dto.location=:l and"
		+ " dto.companyName=:n")
@NamedQuery(name = "readAll", query = "select dto from EmployeeDto dto")

public class EmployeeDto {
	@Id
	private int id;
	private String companyName;
	private int noOfEmployes;
	private int yearlyIncome;
	private String location;
	private int zipcode;
	private long contactNumber;
	private String ownerName;
	private float rating;
	private char symbol;

}
