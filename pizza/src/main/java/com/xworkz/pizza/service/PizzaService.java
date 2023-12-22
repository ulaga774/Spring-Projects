package com.xworkz.pizza.service;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;

import com.xworkz.pizza.dto.PizzaDto;

public interface PizzaService {
	public boolean validateAndSave(PizzaDto dto)throws ServletException, IOException, ClassNotFoundException, SQLException;

}
