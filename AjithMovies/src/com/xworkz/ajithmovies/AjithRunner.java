package com.xworkz.ajithmovies;

import com.xworkz.ajithmovies.dao.AkMoviesDao;
import com.xworkz.ajithmovies.dao.AkSongsDao;
import com.xworkz.ajithmovies.dto.AjithDto;

public class AjithRunner {

	public static void main(String[] args) {
		AjithDto dto = new AjithDto("valimai_movie", 55, 63, "shalani", "maha");
		AjithDto dto1 = new AjithDto("valimai_song", 55, 63, "shalani", "maha");
		
		AkMoviesDao dao = new AkMoviesDao();
		AjithDto[] save = 	dao.save(dto);
		System.out.println(save);
		AkSongsDao dao1 = new AkSongsDao();
		AjithDto[] save1 = dao.save(dto1);
		System.out.println(save1);

	}

}
