package com.xworkz.vehicle.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@NamedQuery(name = "FindName", query = "Select dto from VehicleDto dto where dto.name=:nm")
@NamedQuery(name = "findByConsumesAndType", query = "Select dto from VehicleDto dto where dto.consumes=:c and dto.type=:t")
@NamedQuery(name = "updateType", query = "update VehicleDto dto set dto.type=:tt where dto.name=:n ")
@NamedQuery(name= "updated" ,query= "Update  VehicleDto dto set dto.lunchedIn=:lun ,dto.type =:type  where dto.id=:id")
@NamedQuery(name= "delete" ,query= "delete from VehicleDto dto where dto.lunchedIn=:lu")

@Table(name = "Vehicle_info")
public class VehicleDto {
	@Id
	private int id;
	@NotBlank
	@NotEmpty
	private String name;
	@NotBlank
	@NotEmpty
	private String type;
	@NotBlank
	@NotEmpty
	private String consumes;

	private float lunchedIn;

}
