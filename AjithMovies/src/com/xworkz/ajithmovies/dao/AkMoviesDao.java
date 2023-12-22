package com.xworkz.ajithmovies.dao;

import com.xworkz.ajithmovies.constant.AjithAbstract;
import com.xworkz.ajithmovies.dto.AjithDto;

public class AkMoviesDao extends AjithAbstract{
	
	AjithDto[] ak = new AjithDto[5];
	
	public AjithDto[] save(AjithDto dto) {
		if(dto!=null) {
			for (int i = 0; i < ak.length; i++) {
				if(ak[i]==null) {
					ak[i]=dto;
					System.out.println("saved_movie");
					return ak;
				}
			}
		}
		return null;
	}

	public AjithDto[] read() {
		return ak;
	}
	
}
