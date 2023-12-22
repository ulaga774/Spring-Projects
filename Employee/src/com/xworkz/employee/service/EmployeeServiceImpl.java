package com.xworkz.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.employee.dto.EmployeeDto;
import com.xworkz.employee.repo.EmployeeRepo;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;

	@Override
	public boolean save(EmployeeDto dto) {
		if (dto != null) {
			if (dto.getId() >= 0) {
				if (dto.getCompanyName().length() >= 3) {
					if (dto.getContactNumber() >= 87654321L) {
						if (dto.getLocation().length() >= 3) {
							if (dto.getOwnerName().length() >= 3 && dto.getOwnerName().length() <= 30) {
								if (dto.getNoOfEmployes() >= 432L) {
									if (dto.getRating() >= 1.1f) {
										if (dto.getYearlyIncome() >= 123456) {
											if (dto.getZipcode() >= 123) {
												System.out.println("dto is valid ");
												repo.save(dto);
												return true;
											}
											System.out.println("zipcode is lessthan 123");
											return false;
										}
										System.out.println("yearlyIncome is lesstan 123456");
										return false;
									}
									System.out.println("rating is less than 1.1f");
									return false;
								}
								System.out.println("noOfEmployess is lessthan 432L");
								return false;
							}
							System.out.println("getOwnerName is must be in givan range");
							return false;
						}
						System.out.println("getLocation is less than 3");
						return false;

					}
					System.out.println("getContactNumber not valid");
					return false;
				}
				System.out.println("getCompanyName is less than 3");
				return false;
			}
			System.out.println("getId not valid");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public EmployeeDto findByName(String name) {
		if(name !=null) {
			return repo.findByName(name);
		}
		return null;
	}

	@Override
	public EmployeeDto findByNameAndLocation(String companyName, String Location) {
		if(companyName != null) {
			if(Location != null) {
				return repo.findByNameAndLocation(companyName, Location);
			}
		}
		return null;
	}

	@Override
	public boolean updateNameByid(int id, String name) {
		if(name != null) {
			if(id>=0 && id<=3) {
				return repo.updateNameByid(id, name);
			}
		}
		return false;
	}

	@Override
	public boolean updateSysmbolByLocationAndZipcode(String locatio, int zipcode, char symbol) {
		if(locatio != null) {
			if(zipcode>=3) {
				if(symbol != '@') {
					return repo.updateSysmbolByLocationAndZipcode(locatio, zipcode, symbol);
					
				}
			}
			
		}
		return false;
	}

	@Override
	public boolean deleteByRating(float rating) {
		if(rating>=0f) {
			return repo.deleteByRating(rating);
			
		}
		return false;
	}

	@Override
	public boolean deleteByLocationAndName(String location, String name) {
		if(location != null) {
			if(name != null) {
				return repo.deleteByLocationAndName(location, name);
			}
		}
		return false;
	}

	@Override
	public List<EmployeeDto> readAll() {
	
		return repo.readAll();
	}


}