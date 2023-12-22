package com.xworkz.playground.repositry;

import com.xworkz.playground.dto.GroundDto;

public interface GroundRepositry {
	
	public boolean velidateandSave(GroundDto dto);
	public boolean updateByGroundName(int id , String GroundName);
	public boolean readByGroundName(String GroundName );
	public boolean deleteBYGroundName(String GroundName );
	public boolean readByIdAndPlace(int id, String place );

}
