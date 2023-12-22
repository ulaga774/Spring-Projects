package com.xworkz.landrecord.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.xworkz.landrecord.service.EditAndDeleteService;

@Controller
@Component
public class EditAndDeleteController {

	@Autowired
	private EditAndDeleteService editService;

	@GetMapping(value = "/editRecords")
	public String EditRecords(Model model, @RequestParam String ownerName, @RequestParam String mobileNumber,
			@RequestParam String aadharNumber, @RequestParam String houseNumber, @RequestParam String surveyNumber,
			@RequestParam String year) {

		boolean edit = editService.EditByAadharNo(ownerName, mobileNumber, aadharNumber, houseNumber, surveyNumber,
				year, model);
		if (edit) {
			model.addAttribute("edited", "updated in records");
			return "edit";
		}
		return "edit";

	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(@RequestParam("houseNumber") String houseNumber,
			@RequestParam("surveyNumber") String surveyNumber, Model model) {

		boolean delete = editService.deleteRecords(houseNumber, surveyNumber, model);
		System.out.println(houseNumber);
		System.out.println(surveyNumber);
		if (delete) {
			System.out.println("Deleted ...");
			return "viewrecords";
		}
		System.out.println(" Not Deleted ...");
		return "viewrecords";
	}

}
