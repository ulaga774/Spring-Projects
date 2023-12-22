package com.xworkz.ajithmovies.dto;

public class AjithDto {
	
	private String name;
	private int age;
	private int noOfMovies;
	private String wife;
	private String daughter;
	public AjithDto(String name, int age, int noOfMovies, String wife, String daughter) {
		super();
		this.name = name;
		this.age = age;
		this.noOfMovies = noOfMovies;
		this.wife = wife;
		this.daughter = daughter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNoOfMovies() {
		return noOfMovies;
	}
	public void setNoOfMovies(int noOfMovies) {
		this.noOfMovies = noOfMovies;
	}
	public String getWife() {
		return wife;
	}
	public void setWife(String wife) {
		this.wife = wife;
	}
	public String getDaughter() {
		return daughter;
	}
	public void setDaughter(String daughter) {
		this.daughter = daughter;
	}
	@Override
	public String toString() {
		return "AjithDto [name=" + name + ", age=" + age + ", noOfMovies=" + noOfMovies + ", wife=" + wife
				+ ", daughter=" + daughter + "]";
	}
	
	

}
