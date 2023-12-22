package com.xworkz.india;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IndiaRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/indian", "root", "Xworkzodc@123");
			String query = "insert into language values(20,'tamilnadu','karanataka','kerala','delhi','rajasthan','mp','karanataka','srilanka','bangaladesh')";
			Statement sta = con.createStatement();
			boolean result = sta.execute(query);
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		

	}

}
