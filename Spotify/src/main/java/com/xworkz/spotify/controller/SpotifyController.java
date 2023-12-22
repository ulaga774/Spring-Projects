package com.xworkz.spotify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.spotify.dto.SpotifyDto;
import com.xworkz.spotify.service.SpotifyService;

@Controller
@Component
public class SpotifyController {
	@Autowired
	private SpotifyService service;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String getindex(SpotifyDto dto, Model model) {
		System.out.println(dto);
		boolean save = service.save(dto, model);
		if (save) {
			model.addAttribute("save", dto);
			return "sucess";
		}
		return "addsong";
	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String read(Model model) {
		List<SpotifyDto> list = service.read();
		model.addAttribute("all", list);
		return "viewsong";

	}

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String find(String songName, Model model) {

		SpotifyDto dto = service.findBySongName(songName, model);
		model.addAttribute("song", dto);
		return "find";
	}

}
