package com.xworkz.comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsRunner {

	public static void main(String[] args) {
		List<ComparatorsDto> list = new ArrayList<ComparatorsDto>();
		ComparatorsDto dto = new ComparatorsDto("ulaga" , 28);
		ComparatorsDto dto1 = new ComparatorsDto("mass" , 27);
		ComparatorsDto dto2 = new ComparatorsDto("sanjay" , 29);
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		
		
		Comparator<ComparatorsDto> comp = new Comparator<ComparatorsDto>() {

			

			@Override
			public int compare(ComparatorsDto o1, ComparatorsDto o2) {
				if(o1.getAge()>o2.getAge()) {
					return 1;
				}
				return -1;
			}
			 
		};
		
		Collections.sort(list ,comp);
		
		for (Object obj : list) {
			System.out.println(obj);
		}

	}

}
