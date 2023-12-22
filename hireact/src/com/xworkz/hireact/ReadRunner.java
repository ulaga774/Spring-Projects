package com.xworkz.hireact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //load and resgiter 
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			String tableQuery = "select * from movies";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hireact", "root", "Xworkzodc@123");
			Statement sta = con.createStatement();
			ResultSet readResult = sta.executeQuery(tableQuery);
			System.out.println(readResult);
		//	System.out.println(readResult.toString());
			if(readResult!=null) {
				while(readResult.next()) {
					System.out.println(readResult.getInt(1)+"  "+readResult.getString(2)+"  "+readResult.getString(3)+"  "+readResult.getString(4));
				}    
			}
			con.close();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
