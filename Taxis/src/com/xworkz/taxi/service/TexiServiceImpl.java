package com.xworkz.taxi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.repo.TexiRepo;
import com.xworkz.taxi.repo.TexiRepoImpl;

@Component

public class TexiServiceImpl implements TexiService {

	@Autowired
	private TexiRepo repo;

	@Override
	public boolean save(TaxiDto dto) {
		if (dto != null) {
			if (dto.getId() >= 0) {
				if (dto.getTaxiNo() >= 1234) {
					if (dto.getEarnings() >= 1000) {
						if (dto.getLocation().length() >= 2) {
							if (dto.getNoOfTrips() >= 2) {
								repo.save(dto);
								System.out.println("data is valid");
								return true;
							}
							System.out.println("trips is lessthan 2");
							return false;
						}
						System.out.println("location is lessthan 2");
						return false;
					}
					System.out.println("earnings is not valid");
					return false;
				}
				System.out.println("texi no is not valid");
				return false;
			}
			System.out.println("check the id");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public boolean updateEarningByLocation(int earnings, String location) {
		if(location != null) {
			return repo.updateEarningByLocation(earnings, location); 
		}
	
		return false;
	}

	@Override
	public boolean updateAvailableById(boolean available, int id) {
		if(id>=0) {
			return repo.updateAvailableById(available, id);
		}
		return false;
	}

	@Override
	public TaxiDto findByLocation(String location) {
		if(location != null) {
			return repo.findByLocation(location);
		}
		return null;
	}

	@Override
	public List<TaxiDto> readAll() {
		return repo.readAll();
	}

	@Override
	public List<TaxiDto> findAllTaxiIsAvailable() {
		return repo.findAllTaxiIsAvailable();
	}

}
