package com.ott.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TVProgram {

	private String episodeNum;
	private String pName;
	private String pBoardCasting;
	private String pAirDate;
	private String pDirector;
	private String pWriter;
	private String pActor;
	private String genreAlt;
	private String ageRating;
	private String thumnail_path;
	
	
}
