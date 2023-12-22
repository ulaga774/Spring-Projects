package com.xworkz.restaurants.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.restaurants.dto.RestaurantDto;

public interface RestaurantService {
	public boolean ValidationAndSave(RestaurantDto dto) throws Exception;

	public RestaurantDto find(String Name) throws ClassNotFoundException, SQLException;

}
