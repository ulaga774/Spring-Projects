package com.xworkz.school.dto;

public class SchoolDto {
	
	private String schoolName;
	private int strength;
	private long concectNumber;
	public SchoolDto(String schoolName, int strength, long concectNumber) {
		super();
		this.schoolName = schoolName;
		this.strength = strength;
		this.concectNumber = concectNumber;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public long getConcectNumber() {
		return concectNumber;
	}
	public void setConcectNumber(long concectNumber) {
		this.concectNumber = concectNumber;
	}
	@Override
	public String toString() {
		return "SchoolDto [schoolName=" + schoolName + ", strength=" + strength + ", concectNumber=" + concectNumber
				+ "]";
	}
	
	
	

}
