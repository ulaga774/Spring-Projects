package com.xworkz.taxi.repo;

import java.util.Comparator;

import com.xworkz.taxi.dto.TaxiDto;

public class Comparater implements Comparator<TaxiDto>{

	@Override
	public int compare(TaxiDto o1, TaxiDto o2) {
		if(o1.getEarnings()<o2.getEarnings()) {
			return -1;
		}
		return 0;
	}

}
