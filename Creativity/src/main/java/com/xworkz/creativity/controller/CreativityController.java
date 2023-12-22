package com.xworkz.creativity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.creativity.dto.CreativityDto;
import com.xworkz.creativity.service.CreativityService;

@Controller
@Component
public class CreativityController {
	@Autowired
	private CreativityService service;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String getindex(CreativityDto dto, Model model) {
		System.out.println(dto);
		boolean save = service.save(dto, model);
		if (save) {
			model.addAttribute("save", dto);
			return "sucess";
		}
		
		return "index";
	}

}
