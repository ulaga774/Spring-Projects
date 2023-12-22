package com.xworkz.landrecord.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.xworkz.landrecord.dto.LandRecordDetailsDto;
import com.xworkz.landrecord.service.ViewRecordService;

@Controller
@Component

public class ViewRecordsController {

	@Autowired
	private ViewRecordService Viewservice;
	
	@RequestMapping(value = "/viewrecord", method = RequestMethod.POST)
	public String read(@RequestParam String taluk, @RequestParam String hobli,@RequestParam String village, Model model) {
		
	 List<LandRecordDetailsDto> dto=Viewservice.readBYVillage(taluk, hobli, village, model);
		if(dto!= null) {
			 model.addAttribute("read", dto);
			 System.out.println("present");
			 return "viewrecords";
		}
		model.addAttribute("reading","No Records Found");
		return "viewrecords";
		
	}
	
}
