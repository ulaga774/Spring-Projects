
package com.xworkz.playground.repositry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.playground.dto.GroundDto;

public class GroundRepositryImpl implements GroundRepositry {

	@Override
	public boolean velidateandSave(GroundDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/playground", "root",
					"Xworkzodc@123");

			String quary = "insert into ground values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(quary);
			// System.out.println("saved = "+ statement);
			statement.setInt(1, dto.getId());
			statement.setDate(2, dto.getDate());
			statement.setString(3, dto.getGroundName());
			statement.setInt(4, dto.getNoOfGames());
			statement.setString(5, dto.getGamesName());
			statement.setString(6, dto.getOwnerName());
			statement.setString(7, dto.getPlace());
			statement.setInt(8, dto.getPincode());
			statement.setInt(9, dto.getContactNumber());
			statement.setString(10, dto.getCouchName());
			int saved = statement.executeUpdate();
			System.out.println("values=" + saved);
			statement.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;

	}

	@Override
	public boolean updateByGroundName(int id, String GroundName) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/playground", "root",
					"Xworkzodc@123");
			String quary = "update ground set GroundName=? where id=?";

			PreparedStatement statement = connection.prepareStatement(quary);
			statement.setString(1, GroundName);
			statement.setInt(2, id);

			int i = statement.executeUpdate();
			System.out.println(i);

			statement.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean readByGroundName(String GroundName) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			String quary = "select * from ground where GroundName=?";
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/playground", "root",
					"Xworkzodc@123");
			PreparedStatement statement = connection.prepareStatement(quary);
			statement.setString(1, GroundName);
			ResultSet result = statement.executeQuery();
			// System.out.println(result);
			if (result != null) {
				while (result.next()) {
					System.out.println(result.getInt(1) + "--" + result.getDate(2) + "--" + result.getString(3) + "--"
							+ result.getInt(4) + "--" + result.getString(5) + "--" + result.getString(6) + "--"
							+ result.getString(7) + "--" + result.getInt(8) + "--" + result.getInt(9) + "--"
							+ result.getString(10));

				}
			}
			statement.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteBYGroundName(String GroundName) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/playground", "root",
					"Xworkzodc@123");

			String quary = "delete  from ground where GroundName=? ";
			PreparedStatement statement = connection.prepareStatement(quary);
			statement.setString(1, GroundName);

			int delete = statement.executeUpdate();
			System.out.println(delete);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean readByIdAndPlace(int id, String place) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			String quary = "select * from ground where place=? and  id=?";

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/playground", "root",
					"Xworkzodc@123");
			PreparedStatement statement = connection.prepareStatement(quary);
			statement.setString(1, place);
			statement.setInt(2, id);

			ResultSet result = statement.executeQuery();
			// System.out.println(result);
			if (result != null) {
				while (result.next()) {
					System.out.println(result.getInt(1) + "--" + result.getDate(2) + "--" + result.getString(3) + "--"
							+ result.getInt(4) + "--" + result.getString(5) + "--" + result.getString(6) + "--"
							+ result.getString(7) + "--" + result.getInt(8) + "--" + result.getInt(9) + "--"
							+ result.getString(10));

				}
			}
			statement.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
}