package com.xworkz.flipkart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/card", initParams = { @WebInitParam(name = "user", value = "Varun"),
		@WebInitParam(name = "password", value = "12345") })
public class RunnerServelt extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("userName");
		String pass = req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		String corrName = getInitParameter("user");
		String corrPass = getInitParameter("password");
		writer.println(name);
		writer.println(pass);

		if (!name.isEmpty() && !pass.isEmpty()) {
			System.out.println("name and pass is correct");
			if (name.equals(corrName) && pass.equals(corrPass)) {
				req.getRequestDispatcher("/Wellcome.jsp").forward(req, resp);
			} else {

				writer.println("userName and password is not matched");
				req.getRequestDispatcher("/Login.jsp").include(req, resp);
			}
		}

	}

}
