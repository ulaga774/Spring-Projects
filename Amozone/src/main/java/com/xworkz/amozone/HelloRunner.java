package com.xworkz.amozone;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/hello")
public class HelloRunner extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("this is dopost method");
	resp.setContentType("text/html");
	PrintWriter writer = resp.getWriter();
	writer.println("<h1>kiran and varun is idiot<h1>");
	}
	
	

}
