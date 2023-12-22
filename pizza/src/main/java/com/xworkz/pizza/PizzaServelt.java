package com.xworkz.pizza;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.pizza.dto.PizzaDto;
import com.xworkz.pizza.service.PizzaServiceImpl;

@WebServlet(urlPatterns = "/pizza")
public class PizzaServelt extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this is dopost method");
		PizzaDto dto = new PizzaDto();
		dto.setPizzaName(req.getParameter("PizzaName"));
		dto.setPizzaTypes(req.getParameter("types"));
		dto.setSize(req.getParameter("size"));
		dto.setLocation(req.getParameter("location"));
		dto.setPaymentMode(req.getParameter("payment"));
 
		PizzaServiceImpl service = new PizzaServiceImpl();
		try {
			service.validateAndSave(dto);
		} catch (ClassNotFoundException | ServletException | IOException | SQLException e) {
			
			e.printStackTrace();
		}
		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>" + "<B>" + dto.getPizzaName() + "</B>" + "</h1>" + "<br>");
		writer.println("<h1>" + "<B>" + dto.getLocation() + "</B>" + "</h1>" + "<br>");
		writer.println("<h1>" + "<B>" + dto.getPaymentMode() + "</B>" + "</h1>" + "<br>");
		writer.println("<h1>" + "<B>" + dto.getPizzaTypes() + "</B>" + "</h1>" + "<br>");
		writer.println("<h1>" + "<B>" + dto.getSize() + "</B>" + "</h1>" + "<br>");
		

	}

}
