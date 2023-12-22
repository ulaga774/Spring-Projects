package com.xworkz.ajithmovies.dao;

import com.xworkz.ajithmovies.constant.AjithAbstract;
import com.xworkz.ajithmovies.dto.AjithDto;

public class AkSongsDao extends AjithAbstract {
	
	AjithDto[] ak = new AjithDto[5];

	@Override
	public AjithDto[] save(AjithDto dto) {
		if(dto!=null) {
			for (int i = 0; i < ak.length; i++) {
				if(ak[i]==null) {
					ak[i]=dto;
					System.out.println("saved_song");
					return ak;
				}
			}
		}
		return null;
	}

	@Override
	public AjithDto[] read() {
		
		return ak;
	}



	
	
}
