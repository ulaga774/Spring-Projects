package com.xworkz.jcb;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/mass")
public class JcbServelt extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this is do post method");
		String name = req.getParameter("userName");
		String pass = req.getParameter("password");
		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();
		writer.println(name);
		writer.println(pass);
		
	

	}
	

}
