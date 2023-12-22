package com.xworkz.creativity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.creativity.dto.CreativityDto;
import com.xworkz.creativity.repositry.CreativityRepo;

@Component
public class CreativityServiceImpl implements CreativityService {

	@Autowired
	private CreativityRepo repo;

	@Override
	public boolean save(CreativityDto dto, Model model) {
		if (dto != null) {
			if (validation(dto, model)) {
				System.out.println("valied sucessfull to repo");
				repo.save(dto, model);
				System.out.println("send sucessfull to repo");
				return true;
			}
		}
		System.out.println("dto is null-");
		return false;
	}

	public boolean validation(CreativityDto dto, Model model) {
		boolean isValid = true;

		if (dto != null) {
			if (dto.getName() == null || dto.getName().length()<=3) {
				model.addAttribute("Name", "Name Is Not Valid");
				System.out.println("Name Is Not Valid");
				isValid = false;
			}
			if (dto.getEmail() == null) {
				model.addAttribute("Email", "Email Is Not Valid");
				System.out.println("Email Is Not Valid");
				isValid = false;
			}
			if (dto.getPhoneNumber() == null || dto.getPhoneNumber().length()<=6) {
				model.addAttribute("PhoneNumber", "PhoneNumber Is Not Valid");
				System.out.println("PhoneNumber Is Not Valid");
				isValid = false;
			}
			if (dto.getLocation() == null || dto.getLocation().length()<=3) {
				model.addAttribute("Location", "Location Is Not Valid");
				System.out.println("Location Is Not Valid");
				isValid = false;
			}
			if (dto.getFatherName() == null || dto.getFatherName().length()<=3) {
				model.addAttribute("FatherName", "FatherName Is Not Valid");
				System.out.println("FatherName Is Not Valid");
				isValid = false;
			}
			if (dto.getMotherName() == null || dto.getMotherName().length()<=3) {
				model.addAttribute("MotherName", "MotherName Is Not Valid");
				System.out.println("MotherName Is Not Valid");
				isValid = false;
			}
		} else {
			System.out.println("dto is null");
			isValid = false;
		}

		return isValid;
	}

}
