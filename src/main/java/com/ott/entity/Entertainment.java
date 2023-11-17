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
public class Entertainment {

	private String episodeNum;
	private String eName;
	private String eBoardCasting;
	private String eAirDate;
	private String eDirector;
	private String eWriter;
	private String eActor;
	private String genreAlt;
	private String thumnail_path;
}
