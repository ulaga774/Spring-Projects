package com.xworkz.taxi.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.core.serializer.Serializer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "taxi_info")
@Entity
@NamedQuery(name = "update", query = "update TaxiDto dto set dto.earnings=:e"
		+ " where dto.location=:l")
@NamedQuery(name = "updateById", query = "update TaxiDto dto set dto.isAvailable=:a"
		+ " where dto.id=:i")
@NamedQuery(name = "find", query = "Select dto from TaxiDto dto where dto.location=:lo")
@NamedQuery(name = "readAll", query = "select dto from TaxiDto dto")

@NamedQuery(name = "readAllTaxi", query = "Select dto from TaxiDto dto")
public class TaxiDto{
	@Id
	private int id;
	private int taxiNo;
	private int earnings;
	private boolean isAvailable;
	private String location;
	private int noOfTrips;

}
