package com.xworkz.amozone;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/wellcome")
public class RunnerServelt extends HttpServlet {
	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.setContentType("text/html");
//		PrintWriter writer = resp.getWriter();
//		
//		writer.println(" <form action=\"wellcome\" method=\"post\">\r\n"
//				+ "                        <input type=\"email\" name=\"email\" placeholder=\"Enter Email Here\">\r\n"
//				+ "                    <input type=\"password\" name=\"password\" placeholder=\"Enter Password Here\">\r\n"
//				+ "                    <button class=\"btnn\"><a href=\"#\">Login</a></button>\r\n" + "\r\n"
//				+ "                    </form>");
//
//	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("email");
		String pass = req.getParameter("password");
		System.out.println(name);
		System.out.println(pass);

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		req.getRequestDispatcher("/hello").forward(req, resp);
		

	}

}
