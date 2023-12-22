package com.xworkz.resume;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/resume" , loadOnStartup = 2)
public class ResumeServelt extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this is ResumeServelt ");

		String userName = req.getParameter("fristname");
		String Name = req.getParameter("lastname");
		String email = req.getParameter("email");
		String job = req.getParameter("job");
		String project = req.getParameter("project");

		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();

		writer.println("<h1>" + "<B>" + userName + "</B>" + "</h1>" + "<br>");
		writer.println("<h1>" + "<B>" + Name + "</B>" + "</h1>" + "<br>");
		writer.println("<h1>" + "<B>" + email + "</B>" + "</h1>" + "<br>");
		writer.println("<h1>" + "<B>" + job + "</B>" + "</h1>" + "<br>");
		writer.println("<h1>" + "<B>" + project + "</B>" + "</h1>" + "<br>");

	}

}
