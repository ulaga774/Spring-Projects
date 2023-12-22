package com.xworkz.dao;

import com.xworkz.anime.constant.AnimeAbstract;
import com.xworkz.dto.AnimeDto;


public class NarutoDao extends AnimeAbstract {

AnimeDto[] anime = new AnimeDto[10];
	
	
	public AnimeDto[] save(AnimeDto dto) {
		for(int i=0;i<anime.length;i++) {
			if(anime[i]== null) {
				anime[i]=dto;
				System.out.println("saved");
				return anime;
			}
		}
		return null;
		
	}


	@Override
	public AnimeDto[] read() {
		// TODO Auto-generated method stub
		return anime;
	}

}
