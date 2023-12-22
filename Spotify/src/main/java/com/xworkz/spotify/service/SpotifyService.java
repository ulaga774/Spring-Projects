package com.xworkz.spotify.service;

import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.spotify.dto.SpotifyDto;

public interface SpotifyService {
	public boolean save(SpotifyDto dto ,Model model );
	public List<SpotifyDto> read();
	public SpotifyDto findBySongName(String SongName,Model model);

}
