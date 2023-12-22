package com.xworkz.dto;

public class AnimeDto {
	
	private String name;
	private int episodes;
	private String Character;
	private String Strong;
	private int duration;
	
	public AnimeDto(String name,int episodes,String Character,String Strong,int duration) {
		this.name = name;
		this.episodes = episodes;
		this.Character = Character;
		this. Strong =  Strong;
		this.duration = duration;
	}
	
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}

	public int getEpisodes() {
		return episodes;
	}

	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}

	public String getCharacter() {
		return Character;
	}

	public void setCharacter(String character) {
		Character = character;
	}

	public String getStrong() {
		return Strong;
	}

	public void setStrong(String strong) {
		Strong = strong;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String toString() {
		return "AnimeDto [name=" + name + ", episodes=" + episodes + ", Character=" + Character + ", Strong=" + Strong
				+ ", duration=" + duration + "]";
	}
	
	
	
	

}
