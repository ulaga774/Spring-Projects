package com.xworkz.comparators;

public class ComparatorsDto implements Comparable<ComparatorsDto>{
	
	private String name;
	private int age;
	public ComparatorsDto(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "ComparatorsDto [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(ComparatorsDto o) {
		if()
		return 0;
	}
	
	

}
