package com.xworkz.landrecord.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.xworkz.landrecord.dto.LandRecordAdminDto;
import com.xworkz.landrecord.service.LandRecordService;

@Controller
@Component
public class LandRecordController {

	@Autowired
	private LandRecordService service;

	@RequestMapping(value = "/otp", method = RequestMethod.POST)
	public String save(LandRecordAdminDto dto, Model model) {
		boolean save = service.save(dto, model);
		if (save) {
			model.addAttribute("save", "saved");
			return "view";
		}

		return null;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String verify(@RequestParam String email, String otp, Model model, LandRecordAdminDto dto,
			@RequestParam("action") String action) {
		if ("otp".equals(action)) {

			boolean generatedOtp = service.checkOtp(email, model);
			model.addAttribute("Email", dto.getEmail());
			if (!generatedOtp) {

				model.addAttribute("EmailError", "Invalid email");
				return "admin";
			}
			return "admin";

		} else if ("submit".equals(action)) {

			LandRecordAdminDto save = service.findByOtp(otp, model);
			if (save == null) {
				model.addAttribute("OtpError", "Invalid OTP");
				return "admin";
			}
			System.out.println("------------" + save);
			model.addAttribute("AdminName", save.getAdminName());
			return "login";

		} else {
			System.out.println("---");
			return "error";
		}
	}

	@RequestMapping(value = "/records", method = RequestMethod.POST)
	public String processForm(@RequestParam("action") String action, Model model) {
	    if ("addrecords".equals(action)) {
	    	
	        return "addrecords";
	    } else if ("viewrecords".equals(action)) {
	        return "viewrecords";
	    } else {
	    	System.out.println("error");
	        return "error";
	    }
	}

}
