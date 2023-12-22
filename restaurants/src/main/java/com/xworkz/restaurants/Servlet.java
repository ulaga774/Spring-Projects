package com.xworkz.restaurants;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.restaurants.dto.RestaurantDto;
import com.xworkz.restaurants.service.RestaurantServiceImpl;
@WebServlet(urlPatterns = "/food", loadOnStartup = 1)
public class Servlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this is doPost Method");
		RestaurantDto dto = new RestaurantDto();
		dto.setName(req.getParameter("name"));
		dto.setFoodTypes(req.getParameter("types"));
		dto.setLocation(req.getParameter("location"));
		dto.setPinCode(req.getParameter("pincode"));
		dto.setEmail(req.getParameter("email"));
		dto.setContactNumber(req.getParameter("contactNumber"));
		dto.setBranches(req.getParameter("branch"));
		dto.setStatus(req.getParameter("Status"));
		dto.setPaymentMode(req.getParameter("PaymentMode"));
		
		RestaurantServiceImpl service = new RestaurantServiceImpl();
		try {
			service.ValidationAndSave(dto);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();
//		writer.println("<h1>" + "<B>" + dto.getName() + "</B>" + "</h1>" + "<br>");
//		writer.println("<h1>" + "<B>" + dto.getFoodTypes() + "</B>" + "</h1>" + "<br>");
//		writer.println("<h1>" + "<B>" + dto.getLocation() + "</B>" + "</h1>" + "<br>");
//		writer.println("<h1>" + "<B>" + dto.getPinCode() + "</B>" + "</h1>" + "<br>");
//		writer.println("<h1>" + "<B>" + dto.getEmail() + "</B>" + "</h1>" + "<br>");
//		writer.println("<h1>" + "<B>" + dto.getContactNumber() + "</B>" + "</h1>" + "<br>");
//		writer.println("<h1>" + "<B>" + dto.getBranches() + "</B>" + "</h1>" + "<br>");
//		writer.println("<h1>" + "<B>" + dto.getStatus() + "</B>" + "</h1>" + "<br>");
//		writer.println("<h1>" + "<B>" + dto.getPaymentMode() + "</B>" + "</h1>" + "<br>");
		
		writer.println("<h1>" + "<B>" + "Thank You Coming" + "</B>" + "</h1>" + "<br>");
		
		
		try {
		RestaurantDto found =	service.find( "HelloGuys");
			resp.setContentType("text/HTML");
			PrintWriter find = resp.getWriter();
			find.println(found);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("this is error");
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}

}
