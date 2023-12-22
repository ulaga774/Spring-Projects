package com.xworkz.pizza.repositry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.pizza.dto.PizzaDto;

public class PizzaRepositryImpl implements PizzaRepositry {

	@Override
	public boolean Save(PizzaDto dto) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza_info", "root",
				"Xworkzodc@123");
		String quary = "insert into pizza_table values(?,?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(quary);
		statement.setString(1, dto.getPizzaName());
		statement.setString(2, dto.getPizzaTypes());
		statement.setString(3, dto.getSize());
		statement.setString(4, dto.getLocation());
		statement.setString(5, dto.getPaymentMode());
		int saved = statement.executeUpdate();
		System.out.println("values=" + saved);
		statement.close();

		return false;
	}

}
