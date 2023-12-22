package com.xworkz.taxi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "taxi_Imfor")
@Entity
@NamedQuery(name = "update", query = "update TaxiDto dto set dto.earnings=:e" + " where dto.location=:l")
@NamedQuery(name = "updateById", query = "update TaxiDto dto set dto.isAvailable=:a" + " where dto.id=:i")
@NamedQuery(name = "find", query = "Select dto from TaxiDto dto where dto.location=:lo")
@NamedQuery(name = "readAll", query = "select dto from TaxiDto dto")

@NamedQuery(name = "readAllTaxi", query = "Select dto from TaxiDto dto")
@NamedQuery(name = "lowest", query = "Select dto from TaxiDto dto")
public class TaxiDto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int taxiNo;
	private int earnings;
	private boolean isAvailable;
	private String location;
	private int noOfTrips;
	
	
	public TaxiDto(int taxiNo, int earnings, boolean isAvailable, String location, int noOfTrips) {
		super();
		this.taxiNo = taxiNo;
		this.earnings = earnings;
		this.isAvailable = isAvailable;
		this.location = location;
		this.noOfTrips = noOfTrips;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	String value = String.valueOf(taxiNo);
//	String value1 = String.valueOf(earnings);
//	String value2 = String.valueOf(isAvailable);
//	String value3 = String.valueOf(noOfTrips);	
//	String value = Integer.toString(taxiNo);
//	String value1 = Double.toString(earnings); 
//	String value2 = Boolean.toString(isAvailable);
//	String value3 = Integer.toString(noOfTrips);	
//	public TaxiDto(String value, String value1, String value2, String location, String value3) {
//		super();
//		
//		this.value = value;
//		this.value1 = value1;
//		this.value2 = value2;
//		this.location = location;
//		this.value3 = value3;
//	}

	
	
}
