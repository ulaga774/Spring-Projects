package com.xworkz.playground.dto;

import java.sql.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class GroundDto {

	private Integer id;
	
	@NotBlank
	private Date date;
	@NotBlank
	private String GroundName;
	@NotBlank
	private Integer noOfGames;
	@Size(min=2,max=50)
	@NotBlank
	private String GamesName;
	@Size(min=2,max=50)
	@NotBlank
	private String OwnerName;
	@Size(min=2,max=50)
	@NotBlank
	private String place;
	@NotBlank
	private Integer pincode;
	@NotBlank
	private Integer contactNumber;
	@Size(min=2,max=50)
	@NotBlank
	private String couchName;


}