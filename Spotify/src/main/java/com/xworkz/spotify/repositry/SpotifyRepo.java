package com.xworkz.spotify.repositry;

import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.spotify.dto.SpotifyDto;


public interface SpotifyRepo{

	public boolean save(SpotifyDto dto,Model model);
	public List<SpotifyDto> read();
	public SpotifyDto findBySongName(String SongName,Model model);
}
