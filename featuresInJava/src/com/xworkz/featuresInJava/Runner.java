package com.xworkz.featuresInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(4);

		Comparator<Integer> comp = (o1, o2) -> {

			if (o1 > o2) {

				return 1;

			}
			return -1;

		};
		Collections.sort(list, comp);

		list.forEach((execute) -> {
			System.out.println(execute);
		});

	}

}
