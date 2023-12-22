package com.xworkz.landrecord.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.landrecord.dto.LandRecordDetailsDto;
import com.xworkz.landrecord.repositry.AddRecordRepo;

@Component
@Service
public class AddRecordServiceImpl implements AddRecordService{
	
	@Autowired
	private AddRecordRepo Addrepo;

	@Override
	public boolean saveRecords(LandRecordDetailsDto dto, Model model) {
		if (dto != null) {
			if (dto.getState() != null && dto.getState().length() >= 1) {
				if (dto.getDistrict() != null) {
					if (dto.getTaluk() != null) {
						if (dto.getVillage() != null) {
							if (dto.getHobli() != null) {
								if (dto.getOwnerName() != null) {
									if (dto.getMobileNumber() != null) {
										if (dto.getHouseNumber() != null) {
											if (dto.getAadharNumber() != null) {
												if (dto.getSurveyNumber() != null) {
													if (dto.getYear() != null) {
														Addrepo.saveRecords(dto, model);
														System.out.println("send to repo");
														return true;

													}
													System.out.println("getYear is null");
													return false;
												}
												System.out.println("getServeyNumber is null");
												return false;
											}
											System.out.println("getAdharNumber is null");
											return false;
										}
										System.out.println("getHosueNumber is null");
										return false;
									}
									System.out.println("getMobileNumber is null");
									return false;
								}
								System.out.println("getOwnerName is null");
								return false;
							}
							System.out.println("gethobil is null");
							return false;

						}
						System.out.println("getVillage is null");
						return false;

					}
					System.out.println("getTaluk is null");
					return false;
				}
				System.out.println("getDistrict is null");
				return false;
			}
			System.out.println("getState is null");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}


}
