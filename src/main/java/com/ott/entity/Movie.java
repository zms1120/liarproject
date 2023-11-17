package com.ott.entity;


import javax.persistence.Entity;

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
	private String mNameko;			//영화이름
	private String prdtYear;		//제작일
	private String openDt;			//개봉일
	private String genreAlt;		//장르
	private String directors;		//감독
	private String companys;		//영화사
	private String thumnail_path;	//썸네일
}
