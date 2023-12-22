package com.xworkz.vadachennai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/send")

public class VadaCheenaiServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException  {
		System.out.println("wellcome my world");
		
	String userName = 	req.getParameter("name");
	String email = 	req.getParameter("email");
	
		
		resp.setContentType("text/HTML");
		PrintWriter  writer = 		resp.getWriter();
		writer.println("<h1>nira nira song</h1>");
		writer.println(userName + email);
		
		
	}

}
