package com.xworkz.landrecord.service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import com.xworkz.landrecord.dto.LandRecordDetailsDto;
import com.xworkz.landrecord.repositry.ViewRecordRepo;

@Component
@Service
public class ViewRecordServiceImpl implements ViewRecordService {
	
	@Autowired
	private ViewRecordRepo viewRepo;
	
	@Override
	public List<LandRecordDetailsDto> readBYVillage(String taluk, String hobli, String village ,Model model) {
		try {
			if(taluk!=null && hobli !=null &&village!= null) {
				List<LandRecordDetailsDto>  list=	viewRepo.readBYVillage(taluk, hobli, village,0);
				if(list != null && !list.isEmpty()) {
					System.out.println("dto present");
					return list;
				}
				model.addAttribute("findnot1", "  records are not found ");
				return null;
			}
		}
		catch(NoResultException e) {
			e.printStackTrace();
			model.addAttribute("findnot", "  records not found ");
			System.out.println("dto null");
			return null;
		}
		return null;
	}

}
