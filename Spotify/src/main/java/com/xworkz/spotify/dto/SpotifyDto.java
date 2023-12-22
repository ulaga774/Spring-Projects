package com.xworkz.spotify.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "song_info")
@NamedQuery(name = "read" , query = "select dto from SpotifyDto dto ")
@NamedQuery(name = "find" , query = "select dto from SpotifyDto dto where dto.songName=:sn ")
public class SpotifyDto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String songName;
	private String articesName;
	private String type;
	private float duration;

}
