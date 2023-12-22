package com.xworkz.pizza.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.pizza.PizzaServelt;
import com.xworkz.pizza.dto.PizzaDto;
import com.xworkz.pizza.repositry.PizzaRepositryImpl;

public class PizzaServiceImpl implements PizzaService {
	PizzaServelt pizza = new PizzaServelt();
	PizzaRepositryImpl repo = new PizzaRepositryImpl();

	public boolean validateAndSave(PizzaDto dto)throws ServletException, IOException, ClassNotFoundException, SQLException {
		System.out.println("validate sucessfully ");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validate = factory.getValidator();
		Set<ConstraintViolation<PizzaDto>> validations = validate.validate(dto);
		if (validations.isEmpty()) {
		boolean save =	repo.Save(dto);
		System.out.println(save);
			System.out.println("No ConstraintViolation");
		} else {
			System.out.println("error");
			System.out.println(validations);
			

		}
		return true;

	}

}
