package com.xworkz.taxi;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.taxi.config.AppConfif;
import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.service.TexiService;
import com.xworkz.taxi.service.TexiServiceImpl;

public class TaxiRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfif.class);
		TexiService service = context.getBean(TexiServiceImpl.class);
		TaxiDto dto = new TaxiDto(4,7575,3000, false, "tamilNdu", 7);
		//service.save(dto);

		System.out.println("-------------updateByLocation----------------");
		boolean update = service.updateEarningByLocation(1900, "tamilNdu");
		System.out.println(update);
		System.out.println("-------------updateById----------------");
		boolean upadteById = service.updateAvailableById(true, 2);
		System.out.println(upadteById);
		System.out.println("------------find by location-----------");
		TaxiDto found = service.findByLocation("mulbagal");
		System.out.println(found);
		System.out.println("----------Read All---------------");
		List<TaxiDto> read = service.readAll();
		for (TaxiDto dtos : read) {
			System.out.println(dtos);

		}
		System.out.println("-------------------------------------------------------------------");
		List<TaxiDto> find = service.findAllTaxiIsAvailable();
		for (TaxiDto taxiDto : find) {
			if(taxiDto.isAvailable()==true) {
				System.out.println(taxiDto);
				
			}if(taxiDto.isAvailable()==false) {
				System.out.println("-------------------------this flase------------");
				System.out.println(taxiDto);
			}
			
		}
		
		
	}

}
