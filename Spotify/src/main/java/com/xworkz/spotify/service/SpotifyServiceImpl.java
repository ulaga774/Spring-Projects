package com.xworkz.spotify.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.spotify.dto.SpotifyDto;
import com.xworkz.spotify.repositry.SpotifyRepo;

@Component

public class SpotifyServiceImpl implements SpotifyService {
	@Autowired
	private SpotifyRepo repo;

	@Override
	public boolean save(SpotifyDto dto, Model model) {
		if (dto != null) {
			if (validation(dto, model)) {
				System.out.println("valied sucessfull to repo");
				repo.save(dto, model);
				System.out.println("send sucessfull to repo");
				return true;
			}
		}
		System.out.println("dto is null");
		return false;
	}

	public boolean validation(SpotifyDto dto, Model model) {
		boolean isValid = true;

		if (dto != null) {
			if (dto.getSongName() == null || dto.getSongName().length() <= 3) {
				model.addAttribute("SongName", "SongName Is Not Valid");
				System.out.println("SongName Is Not Valid");
				isValid = false;
			}
			if (dto.getArticesName() == null || dto.getArticesName().length() <= 3) {
				model.addAttribute("ArticesName", "ArticesName Is Not Valid");
				System.out.println("ArticesName Is Not Valid");
				isValid = false;
			}
			if (dto.getType() == null || dto.getType().length() <= 3) {
				model.addAttribute("type", "Type Is Not Valid");
				System.out.println("Type Is Not Valid");
				isValid = false;
			}
			if (dto.getDuration() <= 2 || dto.getDuration() == 0) {
				model.addAttribute("duration", "Duration Is Not Valid");
				System.out.println("Duration Is Not Valid");
				isValid = false;
			}
		} else {
			System.out.println("dto is null");
			isValid = false;
		}

		return isValid;
	}

	@Override
	public List<SpotifyDto> read() {
		System.out.println("read method");
		return repo.read();
	}

	@Override
	public SpotifyDto findBySongName(String SongName, Model model) {
		if (SongName != null) {
			return repo.findBySongName(SongName, model);
		}
		return null;
	}

}
