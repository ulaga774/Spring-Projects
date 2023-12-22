package com.xworkz.abstraction;

public class Runner {
	public static void main(String[] args) {

		Car c = new Car();
		c.petrol();
		c.disel();
		
		System.out.println("---------------------");

		Bike bike = new Bike();

		bike.disel();
		bike.petrol();

	}

}
