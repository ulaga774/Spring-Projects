package com.xworkz.employee;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.employee.config.EmployeeConfig;
import com.xworkz.employee.dto.EmployeeDto;
import com.xworkz.employee.service.EmployeeService;
import com.xworkz.employee.service.EmployeeServiceImpl;

public class EmployeeRunner {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeService service = (EmployeeService) context.getBean(EmployeeServiceImpl.class);
		EmployeeDto dto = new EmployeeDto(1, "kiranInfoTech", 12345, 1234567, "bangalore", 600803, 9360289212L, "kiran",
				4.9F, 'k');
//		service.save(dto);
		EmployeeDto dto1 = new EmployeeDto(2, "UlagaInfoTech", 123456, 12345678, "chennai", 600804, 9360289215L,
				"ulaga", 4.4F, 'u');
//		service.save(dto1);
		EmployeeDto dto2 = new EmployeeDto(3, "VarunInfoTech", 1234567, 123456789, "otty", 600802, 9360289214L, "varun",
				4.5F, 'v');
		// service.save(dto2);
		EmployeeDto dto4 = new EmployeeDto(5, "VarunInfoTech", 1234567, 123456789, "otty", 600802, 9360289214L, "varun",
				4.8F, 'v');
		// service.save(dto4);

		System.out.println("------find by name--------");
		EmployeeDto result = service.findByName("kiranInfoTech");
		System.out.println(result);
		System.out.println("------find by name and location--------");
		EmployeeDto found = service.findByNameAndLocation("UlagaInfoTech", "chennai");
		System.out.println(found);
		System.out.println("------------update by id-------");
		boolean update = service.updateNameByid(3, "varunMahaInfoTech");
		System.out.println(update);
		System.out.println("------------update by location and zipcode-------");
		boolean updateReuslt = service.updateSysmbolByLocationAndZipcode("otty", 600802, 'M');
		System.out.println(updateReuslt);
		System.out.println("------------delete by rating-------");
		boolean delete = service.deleteByRating(4.5f);
		System.out.println(delete);
		System.out.println("------------delete by location and name-------");
		boolean de = service.deleteByLocationAndName("otty", "VarunInfoTech");
		System.out.println(de);
		
		System.out.println("--------readall----");
		List<EmployeeDto> list =	service.readAll();
		for (EmployeeDto employeeDto : list) {
			System.out.println(employeeDto);
		}
	}

}
