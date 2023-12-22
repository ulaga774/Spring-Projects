package com.xworkz.landrecord.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "admin_details")
@NamedQuery(name = "findByMail", query = " select dto from LandRecordAdminDto dto where dto.email=:em")
@NamedQuery(name = "updateByOtp", query = " update LandRecordAdminDto dto set dto.otp =:o where dto.email=:e ")
@NamedQuery(name = "findByOtp", query = " select dto from LandRecordAdminDto dto where dto.otp=:otp")
@NamedQuery(name = "findByEmail", query = "SELECT dto.adminName=:an FROM LandRecordAdminDto dto WHERE dto.email = :e")

public class LandRecordAdminDto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String adminName;
	private String email;
	private String otp;

}
