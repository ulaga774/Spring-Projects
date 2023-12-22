package com.xworkz.hireact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HireactRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hireact", "root", "Xworkzodc@123");
//			System.out.println(con);
			String query = "insert into movies values(1,'junko_faruto','varun','ulaga')";
			Statement sta = con.createStatement();
			boolean result = sta.execute(query);
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	

	}

}
