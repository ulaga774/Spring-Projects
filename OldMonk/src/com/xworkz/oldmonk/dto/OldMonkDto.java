package com.xworkz.oldmonk.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "oldMonk_Info")
@Entity

public class OldMonkDto {
	
	@Id
	private int id;
	private String Brand;
	private int price;
	private int millLeter;
	private int alocholContant;
	

}
