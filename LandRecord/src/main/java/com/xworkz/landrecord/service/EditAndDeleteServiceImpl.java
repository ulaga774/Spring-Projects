package com.xworkz.landrecord.service;

import javax.persistence.NoResultException;

import org.hibernate.hql.internal.QueryExecutionRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import com.xworkz.landrecord.dto.LandRecordDetailsDto;
import com.xworkz.landrecord.repositry.EditAndDeleteRepo;

@Component
@Service
public class EditAndDeleteServiceImpl implements EditAndDeleteService {

	@Autowired
	private EditAndDeleteRepo EditAndDelecterepo;

	@Override
	public boolean EditByAadharNo(String ownerName, String mobileNumber, String aadharNumber, String houseNumber,
			String surveyNumber, String year, Model model) {
		if (houseNumber.length() <= 21) {
			if (surveyNumber.length() < 150) {
				if (aadharNumber.length() == 12) {
					if (ownerName.length() > 3) {
						return EditAndDelecterepo.EditByAadharNo(ownerName, mobileNumber, aadharNumber, houseNumber,
								surveyNumber, year,0);
					} else {
						model.addAttribute("ownerNameError", "Check the owner name");
						System.out.println("ownerNameError");
						return false;
					}
				} else {
					model.addAttribute("aadharNumberError", "Check Aadhar number");
					System.out.println("aadharNumberError");
					return false;
				}
			} else {
				model.addAttribute("surveyNumberError", "Check survey number");
				System.out.println("surveyNumberError");
				return false;
			}
		} else {
			model.addAttribute("HouseNumberError", "Check house number");
			System.out.println("HouseNumberError");
			return false;
		}
	}

	@Override
	public boolean deleteRecords(String houseNumber, String surveyNumber, Model model) {
		try {
			if (houseNumber.length() > 0 && houseNumber.length() < 25) {
				if (surveyNumber.length() > 0 && surveyNumber.length() < 150) {
					return EditAndDelecterepo.deleteRecords(houseNumber, surveyNumber, 1);
				}
				System.out.println("----");
				model.addAttribute("ErrorhouseNumber", " check Hosue number");
				return false;
			}
		} catch (QueryExecutionRequestException e) {
			System.out.println("error occured");
		}
		System.out.println("---------");
		model.addAttribute("ErrorSurveyNumber", " check survey number");
		return false;
	}

	@Override
	public LandRecordDetailsDto ifExists(int houseNumber, int surveyNumber, Model model) {
		try {
			if (houseNumber > 0 && houseNumber < 25) {
				if (surveyNumber > 0 && surveyNumber < 150) {
					LandRecordDetailsDto list = EditAndDelecterepo.ifExists(houseNumber, surveyNumber,0);
					return list;
				}

				System.out.println("wrong survey no");
				return null;
			}
		} catch (NoResultException e) {
			System.out.println("dto error  ");
			return null;
		}
		return null;
	}
}
