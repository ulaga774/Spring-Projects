package com.xworkz.landrecord.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.xworkz.landrecord.dto.LandRecordDetailsDto;
import com.xworkz.landrecord.service.AddRecordService;

@Controller
@Component

public class AddRecordsController {

	@Autowired
	private AddRecordService service;
	

	@RequestMapping(value = "/addrecords", method = RequestMethod.POST)
	public String getindex(LandRecordDetailsDto dto, Model model) {
		System.out.println(dto);
		boolean save = service.saveRecords(dto, model);
		System.out.println(save);
		return "recordsaved";
	}
}
