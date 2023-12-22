package com.xworkz.vehicle;

import java.util.List;

import com.xworkz.vehicle.dto.VehicleDto;
import com.xworkz.vehicle.service.VehicleService;
import com.xworkz.vehicle.service.VehicleServiceImpl;

public class VehicleRunner {

	public static void main(String[] args) {
		VehicleDto dto = new VehicleDto(1, "Ninja", "TwoWheeler", "petrol", 04.2001f);
		VehicleDto dto1 = new VehicleDto(2, "Auto", "ThreeWheeler", "gas", 04.1947f);
		VehicleDto dto2 = new VehicleDto(3, "Car", "FourWheeler", "Diesel", 04.1987f);
		VehicleService service = new VehicleServiceImpl();
//		 service.save(dto);
//		 service.save(dto1);
	//	service.save(dto2);
//		System.out.println("-----------find by name -----------");
//		VehicleDto found = service.findByName("Auto");
//		System.out.println(found);
//
//		System.out.println("-----------find by name -----------");
//		VehicleDto find = service.findByConsumesAndType("Diesel", "4Wheeler");
//		System.out.println(find);
//		System.out.println("-----------update typr by name -----------");
//		boolean update = service.updateTypeByName("2wheeler", "Ninja");
//		System.out.println(update);
//		System.out.println("-----------update -----------");
//		boolean update1 = service.updateLauncheInAndTypeById(04.1999f, "4Wheeler", 3);
//		System.out.println(update1);
		System.out.println("-----------delete -----------");
		boolean delete = service.deleteByLuchedIn(4.2001f);
		System.out.println(delete);
		

		
	}
	

	}


