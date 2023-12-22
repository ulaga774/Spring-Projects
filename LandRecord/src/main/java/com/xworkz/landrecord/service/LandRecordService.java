package com.xworkz.landrecord.service;

import javax.persistence.NoResultException;
import org.springframework.ui.Model;
import com.xworkz.landrecord.dto.LandRecordAdminDto;


public interface LandRecordService {
	public boolean save(LandRecordAdminDto dto ,Model model);
	public LandRecordAdminDto findByMail(String mail ,Model model)throws NoResultException;
	public String generateOtp( int length);
	public boolean checkOtp(String mail ,Model model);
	public LandRecordAdminDto findByOtp(String otp , Model model);
	public boolean otpSend(String otp , String Email ,Model model);
}
