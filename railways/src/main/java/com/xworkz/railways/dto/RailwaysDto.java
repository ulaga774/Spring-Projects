package com.xworkz.railways.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table
public class RailwaysDto {
	@Id
	private int id;
	private String name;
	private String type;
	private String location;
	private float travelTime;

}
