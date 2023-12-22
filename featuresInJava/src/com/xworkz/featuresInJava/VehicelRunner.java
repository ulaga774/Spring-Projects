package com.xworkz.featuresInJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class VehicelRunner {

	public static void main(String[] args) {

		Bike bike = (fuleName) -> {
			System.out.println("petrol");
			System.out.println(fuleName);
			// return fuleName;
		};
		bike.fule("indian oil petrol bunk");

		Car car = (no1, no2) -> {
			System.out.println("disel");
			System.out.println(no1);
			System.out.println(no2);
		};
		car.fule(50000, 75);

		Auto auto = () -> {
			System.out.println("gas");
		};
		auto.fule();

	}

}
