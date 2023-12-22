package com.xworkz.restaurants.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RestaurantDto {
	@NotBlank
	@NotEmpty
	private String Name;
	@NotBlank
	@NotEmpty
	private String foodTypes;
	@NotBlank
	@NotEmpty
	private String Location;
	@NotBlank
	@NotEmpty
	private String PinCode;
	@Email
	@NotBlank
	@NotEmpty
	private String email;
	@NotBlank
	@NotEmpty
	private String contactNumber;
	@NotBlank
	@NotEmpty
	private String branches;
	@NotBlank
	@NotEmpty
	private String status;
	@NotBlank
	@NotEmpty
	private String PaymentMode;
	
	
	

}
