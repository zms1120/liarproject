package com.ott.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
	private String mseq;
	private String mNameko;
	private String prdtYear;
	private String openDt;
	private String genreAlt;
	private String directors;
	private String companys;
	private String thumnail_path;
}
