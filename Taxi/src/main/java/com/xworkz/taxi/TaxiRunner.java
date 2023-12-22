package com.xworkz.taxi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.service.TaxiService;
import com.xworkz.taxi.service.TaxiServiceImpl;
import com.xworkz.texi.config.AppConfig;

@WebServlet(value = "/send")

public class TaxiRunner extends HttpServlet {

	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	// TaxiService service = context.getBean(TaxiServiceImpl.class);
	TaxiService service = new TaxiServiceImpl();

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String taxiNo = req.getParameter("taxiNo");
		String earnings = req.getParameter("earnings");
		String isAvailable = req.getParameter("isAvailable");
		String location = req.getParameter("location");
		String noOfTrips = req.getParameter("noOfTrips");
		System.out.println(taxiNo);
		Integer taxi = Integer.valueOf(taxiNo);
		Integer ear = Integer.valueOf(earnings);
		Integer tri = Integer.valueOf(noOfTrips);
		TaxiDto dto = new TaxiDto(taxi, ear, Boolean.valueOf(isAvailable), location, tri);
		service.save(dto);
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		req.getRequestDispatcher("/viewtaxi.jsp").forward(req, resp);
	}
}

//	public static void main(String[] args) {
//
//		// service.save(dto);
//
//		System.out.println("-------------updateByLocation----------------");
//		boolean update = service.updateEarningByLocation(1900, "tamilNdu");
//		System.out.println(update);
//		System.out.println("-------------updateById----------------");
//		boolean upadteById = service.updateAvailableById(true, 2);
//		System.out.println(upadteById);
//		System.out.println("------------find by location-----------");
//		TaxiDto found = service.findByLocation("mulbagal");
//		System.out.println(found);
//		System.out.println("----------Read All---------------");
//		List<TaxiDto> read = service.readAll();
//		for (TaxiDto dtos : read) {
//			System.out.println(dtos);
//
//		}
//		System.out.println("-------------------------------------------------------------------");
//		List<TaxiDto> find = service.findAllTaxiIsAvailable();
//		for (TaxiDto taxiDto : find) {
//			if (taxiDto.isAvailable() == true) {
//				System.out.println(taxiDto);
//
//			}
//			if (taxiDto.isAvailable() == false) {
//				System.out.println("-------------------------this flase------------");
//				System.out.println(taxiDto);
//			}
//
//		}

//}
//
//}
