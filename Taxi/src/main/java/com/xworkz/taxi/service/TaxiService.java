package com.xworkz.taxi.service;

import java.util.List;

import com.xworkz.taxi.dto.TaxiDto;

public interface TaxiService {
	
	public boolean save(TaxiDto dto);
	public boolean updateEarningByLocation(int earnings ,String location );
	public boolean updateAvailableById(boolean available ,int id);
	public TaxiDto findByLocation(String location);
	public List<TaxiDto> readAll();
	public List<TaxiDto> findAllTaxiIsAvailable();
	public  List<TaxiDto> findLowestEaring();

}
