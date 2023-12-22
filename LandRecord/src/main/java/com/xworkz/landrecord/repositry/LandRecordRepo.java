package com.xworkz.landrecord.repositry;

import org.springframework.ui.Model;

import com.xworkz.landrecord.dto.LandRecordAdminDto;

public interface LandRecordRepo  {
	public boolean save(LandRecordAdminDto dto);
	public LandRecordAdminDto findByMail(String name ,  Model model);
	public boolean updateOtp(String otp ,String mail,Model model);
	public LandRecordAdminDto findByOtp(String otp);
}
