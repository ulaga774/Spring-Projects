package com.xworkz.instagram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InstaRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/entertainment", "root", "Xworkzodc@123");
//			System.out.println(con);
			String query = "insert into relax values(20,11,0,0,'hello','sad','no',100,'frd','to_frd')";
			Statement sta = con.createStatement();
			boolean result = sta.execute(query);
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
