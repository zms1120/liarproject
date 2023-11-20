package com.ott.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

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
	
	@Id
	private String pseq;			//프로그램일련번호
	private String pTitle;			//프로그램제목
	private String episodeNum;   	//회차
	private String pBoardCasting;   //방송사
	private String airingPeriod;	//방영기간
	private String pAirDate;		//회차별방영일
	private String pDirector;		//감독
	private String pWriter;			//작가
	private String pActor;			//출연진
	private String genre;			//장르
	private String nation;			//국가
	private String ageRating;		//등급
	private String description;		//줄거리
	private String thumnail_path;	//썸네일
	
	
}
