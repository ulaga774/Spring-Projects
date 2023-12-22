package com.xworkz.dao;

import com.xworkz.anime.constant.AnimeAbstract;
import com.xworkz.dto.AnimeDto;

public class BakiDao extends AnimeAbstract {
AnimeDto[] animee = new AnimeDto[10];
	
	public AnimeDto[] save(AnimeDto dto) {
		for(int i=0;i<animee.length;i++) {
			if(animee[i]== null) {
				animee[i] = dto;
				System.out.println("saved");
				return animee;
			}
		}
		return null;
	}

	@Override
	public AnimeDto[] read() {
		// TODO Auto-generated method stub
		return animee;
	}

	
	
}
