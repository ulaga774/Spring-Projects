package com.xworkz.anime;

import com.xworkz.dao.NarutoDao;
import com.xworkz.dto.AnimeDto;

public class AnimeRunner {
	
	public static void main(String[] args) {
		
	

	AnimeDto ani = new AnimeDto("baki",24,"yujiro","yuji",20);
	
	NarutoDao naru = new NarutoDao();
	
	 naru.save(ani);
	
	 AnimeDto[]  read = naru.read();
	 for (int i = 0; i < read.length; i++) {
		if (read[i] != null) {
			System.out.println(read[i]);
		}
	}
	}
	
}
