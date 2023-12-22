package com.xworkz.restaurants.repositry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.restaurants.dto.RestaurantDto;

public class RestaurantRepoImpl implements RestaurantRepo {

	@Override
	public boolean save(RestaurantDto dto) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/food", "root",
				"Xworkzodc@123");
		String quary = "insert into customer_info values(?,?,?,?,?,?,?,?,?)";

		PreparedStatement statement = connection.prepareStatement(quary);
		statement.setString(1, dto.getName());
		statement.setString(2, dto.getFoodTypes());
		statement.setString(3, dto.getLocation());
		statement.setString(4, dto.getPinCode());
		statement.setString(5, dto.getEmail());
		statement.setString(6, dto.getContactNumber());
		statement.setString(7, dto.getBranches());
		statement.setString(8, dto.getStatus());
		statement.setString(9, dto.getPaymentMode());

		int saved = statement.executeUpdate();
		System.out.println("values=" + saved);
		statement.close();
		return false;
	}

	@Override
	public RestaurantDto find(String Name) throws ClassNotFoundException, SQLException {
System.out.println("---------");
		Class.forName("com.mysql.cj.jdbc.Driver");
		String quary = "select * from customer_info where Name=?";
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/food", "root",
				"Xworkzodc@123");
		PreparedStatement statement = connection.prepareStatement(quary);
		statement.setString(1, Name);
		ResultSet result = statement.executeQuery();
		if (result != null) {
			while (result.next()) {
				System.out.println(result.getString(1) + "--" + result.getString(2) + "--" + result.getString(3) + "--"
						+ result.getString(4) + "--" + result.getString(5) + "--" + result.getString(6) + "--"
						+ result.getString(7) + "--" + result.getString(8) + "--" + result.getString(9) );

			}
		}
		statement.close();

		return null;
	}

}
