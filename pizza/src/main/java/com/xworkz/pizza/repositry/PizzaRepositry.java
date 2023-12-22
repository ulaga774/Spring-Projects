package com.xworkz.pizza.repositry;

import java.sql.SQLException;

import com.xworkz.pizza.dto.PizzaDto;


public interface PizzaRepositry {
	public boolean Save(PizzaDto dto) throws ClassNotFoundException, SQLException;

}
