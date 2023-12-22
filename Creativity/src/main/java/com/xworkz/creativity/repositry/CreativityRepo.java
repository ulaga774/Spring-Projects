package com.xworkz.creativity.repositry;

import org.springframework.ui.Model;

import com.xworkz.creativity.dto.CreativityDto;

public interface CreativityRepo {

	public boolean save(CreativityDto dto, Model model);

}
