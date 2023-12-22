package com.xworkz.vehicle.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import com.xworkz.vehicle.dto.VehicleDto;
import com.xworkz.vehicle.repositry.VehicleRepositry;
import com.xworkz.vehicle.repositry.VehicleRepositryImpl;

public class VehicleServiceImpl implements VehicleService {

	VehicleRepositry repo = new VehicleRepositryImpl();

	@Override
	public boolean save(VehicleDto dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validate = factory.getValidator();
		Set<ConstraintViolation<VehicleDto>> validations = validate.validate(dto);
		if (validations.isEmpty()) {
			boolean save = repo.save(dto);
			System.out.println(save);
			return true;

		} else {
			System.out.println("error");
			System.out.println(validations);

		}
		return false;
	}

	@Override
	public VehicleDto findByName(String name) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validate = factory.getValidator();
		Set<ConstraintViolation<String>> validations = validate.validate(name);
		if (validations.isEmpty()) {

			return repo.findByName(name);

		} else {
			System.out.println("error");
			System.out.println(validations);

		}
		return null;
	}

	@Override
	public VehicleDto findByConsumesAndType(String consumes, String type) {
		if(consumes != null) {
			if(type != null) {
				return repo.findByConsumesAndType(consumes, type);
			}
			
		}
		return null;
	}

	@Override
	public boolean updateTypeByName(String type, String name) {
		
		if(type != null) {
			if(name != null) {
				return repo.updateTypeByName(type, name);
				
			}
			
		}
		return false;
	}

	@Override
	public boolean updateLauncheInAndTypeById(float lunchedIn, String type, int id) {
		
			if(type != null) {
				return repo.updateLauncheInAndTypeById(lunchedIn, type, id);
			}
		
		return false;
	}

	@Override
	public boolean deleteByLuchedIn(float lunchedIn) {
		
		return repo.deleteByLuchedIn(lunchedIn);
	}

	

}
