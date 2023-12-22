package com.xworkz.playground;

import java.sql.Date;

import com.xworkz.playground.dto.GroundDto;
import com.xworkz.playground.service.GroundService;
import com.xworkz.playground.service.GroundServiceImpl;

public class GroundRunner {

	public static void main(String[] args) {

	//	Date date = new Date(2001, 2, 3);
		
		
				
		
		GroundDto dto = new GroundDto(5, new Date(2003, 5,7), "jayam", 12, "tenise", "madesh", "selam", 8765, 65432, "venkat");
		GroundService service = new GroundServiceImpl();

		service.velidateandSave(dto);
//		System.out.println("-------------update by id-----------");
//		service.updateByGroundName(1, "neptunePark");
//		service.updateByGroundName(2, "playTower");
//
//		System.out.println("-----------read by groundName----------");
//		service.readByGroundName("playTower");
//
//		System.out.println("----readAll----");
//		service.readByGroundName("neptunePark");
//		service.readByGroundName("playTower");
//		service.readByGroundName("jayam");
//
//		System.out.println("------------deletegroundName by id----");
//		service.deleteBYGroundName("jayam");
//
//		System.out.println("------read place and id--");
//		service.readByIdAndPlace(1, "tamilnadu");

	}

}
