package com.xworkz.oldmonk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.oldmonk.dto.OldMonkDto;
import com.xworkz.oldmonk.repo.OldMonkRepo;


@Component
public class OldMonkServiceImpl implements OldMonkService {

	@Autowired
	private OldMonkRepo repo;

	@Override
	public boolean save(OldMonkDto dto) {
		if (dto != null) {
			return repo.save(dto);

		}

		return false;
	}

}
