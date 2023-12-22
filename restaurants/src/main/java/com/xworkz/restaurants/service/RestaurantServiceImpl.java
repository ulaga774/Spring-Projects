package com.xworkz.restaurants.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import com.xworkz.restaurants.dto.RestaurantDto;
import com.xworkz.restaurants.repositry.RestaurantRepoImpl;

public class RestaurantServiceImpl implements RestaurantService {
	RestaurantRepoImpl repo = new RestaurantRepoImpl();

	@Override
	public boolean ValidationAndSave(RestaurantDto dto) throws Exception {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validate = factory.getValidator();
		Set<ConstraintViolation<RestaurantDto>> validations = validate.validate(dto);
		if (validations.isEmpty()) {
			boolean save = repo.save(dto);
			System.out.println(save);
			System.out.println("No ConstraintViolation");
		} else {
			System.out.println("error");
			System.out.println(validations);

		}
		return true;

	}

	@Override
	public RestaurantDto find(String Name) throws ClassNotFoundException, SQLException {
		System.out.println("validate su");
	
		
		return repo.find(Name);
	}

}
