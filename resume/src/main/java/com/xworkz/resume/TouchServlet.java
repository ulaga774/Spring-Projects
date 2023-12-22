package com.xworkz.resume;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/kiran", loadOnStartup = 2)
public class TouchServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("this is doGet Method");
	}@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("this is doPost Method");
	}@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp){
		System.out.println("this is doDelete Method");
	}@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("this is doPut Method");
	}@Override
	protected void doHead(HttpServletRequest arg0, HttpServletResponse arg1){
		System.out.println("this is doHead Method");
	}@Override
	protected void doOptions(HttpServletRequest arg0, HttpServletResponse arg1){
		System.out.println("this is doOptions Method");
	}

}
