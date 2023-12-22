package com.xworkz.landrecord.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Record_Add")

@NamedQuery(name = "readbyvillage", query = "select dto from LandRecordDetailsDto dto where dto.taluk =: tl and dto.hobli =: hb and dto.village =:vl and dto.deletedStatus=:st")

@NamedQuery(name = "Edit", query = "update LandRecordDetailsDto dto set dto.ownerName=:on ,dto.mobileNumber=:pn , dto.aadharNumber=:an, dto.year=:y where dto.surveyNumber=:sn and dto.houseNumber =:hn and dto.deletedStatus=:st")

@NamedQuery(name = "delete" , query = "update LandRecordDetailsDto dto set dto.deletedStatus=1 where dto.houseNumber=:hn and dto.surveyNumber=:sn")

@NamedQuery(name = "ifExist", query = "select dto from LandRecordDetailsDto dto where dto.houseNumber=:hn and dto.surveyNumber=:sn and dto.deletedStatus=:st")

public class LandRecordDetailsDto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String state;
	private String district;
	private String taluk;
	private String hobli;
	private String village;
	private String ownerName;
	private String mobileNumber;
	private String aadharNumber;
	private String houseNumber;
	private String surveyNumber;
	private String year;
	private int deletedStatus = 0;
}
