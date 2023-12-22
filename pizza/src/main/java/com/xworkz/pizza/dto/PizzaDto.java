package com.xworkz.pizza.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class PizzaDto {
	@NotEmpty
	@NotBlank
	private String PizzaName;
	
	private String PizzaTypes;
	@NotEmpty
	@NotBlank
	private String Size;
	@NotEmpty
	@NotBlank
	private String Location;
	
	private String PaymentMode;

	public String getPizzaName() {
		return PizzaName;
	}

	public void setPizzaName(String pizzaName) {
		PizzaName = pizzaName;
	}

	public String getPizzaTypes() {
		return PizzaTypes;
	}

	public void setPizzaTypes(String pizzaTypes) {
		PizzaTypes = pizzaTypes;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getPaymentMode() {
		return PaymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		PaymentMode = paymentMode;
	}

	@Override
	public String toString() {
		return "PizzaDto [PizzaName=" + PizzaName + ", PizzaTypes=" + PizzaTypes + ", Size=" + Size + ", Location="
				+ Location + ", PaymentMode=" + PaymentMode + "]";
	}

}
