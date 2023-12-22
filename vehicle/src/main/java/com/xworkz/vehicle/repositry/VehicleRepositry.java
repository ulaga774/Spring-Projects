package com.xworkz.vehicle.repositry;

import com.xworkz.vehicle.dto.VehicleDto;

public interface VehicleRepositry {
	public boolean save (VehicleDto dto);
	public VehicleDto findByName (String  name);
	public VehicleDto findByConsumesAndType (String  consumes , String type);
	public boolean updateTypeByName (String type ,String name);
	public boolean updateLauncheInAndTypeById (float lunchedIn ,String type ,int id);
	public boolean deleteByLuchedIn(float lunchedIn );
	
	
	

}
