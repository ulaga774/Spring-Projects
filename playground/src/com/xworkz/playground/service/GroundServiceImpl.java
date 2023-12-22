package com.xworkz.playground.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.playground.dto.GroundDto;
import com.xworkz.playground.repositry.GroundRepositry;
import com.xworkz.playground.repositry.GroundRepositryImpl;

public class GroundServiceImpl implements GroundService {
	GroundRepositry repo = new GroundRepositryImpl();

	@Override
	public boolean velidateandSave(GroundDto dto) {

		if (dto != null) {

			System.out.println("validate sucessfully ");

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validate = factory.getValidator();
			Set<ConstraintViolation<GroundDto>> validations = validate.validate(dto);
			if (validations.isEmpty()) {
				boolean save = repo.velidateandSave(dto);
				System.out.println(save);
			} else {
				System.out.println("error");
				System.out.println(validations);

			}
			return true;

		}
		return false;
	}

	@Override
	public boolean updateByGroundName(int id, String GroundName) {
		if (id != 0) {
			if (GroundName != null) {
				System.out.println("validate");
				boolean update = repo.updateByGroundName(id, GroundName);
				System.out.println(update);
				return true;

			}
		}
		return false;
	}

	@Override
	public boolean readByGroundName(String GroundName) {
		if (GroundName != null) {
			boolean read = repo.readByGroundName(GroundName);
			System.out.println(read);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteBYGroundName(String GroundName) {
		if (GroundName != null) {
			System.out.println("delete validate");
			boolean delete = repo.deleteBYGroundName(GroundName);
			System.out.println(delete);
			return true;
		}
		return false;
	}

	@Override
	public boolean readByIdAndPlace(int id, String place) {
		if (id != 0) {
			System.out.println("read validate");
			boolean read = repo.readByIdAndPlace(id, place);
			System.out.println(read);
			return true;
		}
		return false;
	}

}
