package com.xworkz.songs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SongRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "Xworkzodc@123");
			String query = "insert into movie_name values(20,'helloJune','va asure va asura','tea kada raja','ahga naga','trisha','master the blaster','leo leo','enadi mayavii',"
					+ "'no song')";
			Statement sta = con.createStatement();
			boolean result = sta.execute(query);
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		


	}

}
