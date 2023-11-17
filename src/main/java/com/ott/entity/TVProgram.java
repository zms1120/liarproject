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
	private String pseq;			//���α׷��Ϸù�ȣ
	private String pTitle;			//���α׷�����
	private String episodeNum;   	//ȸ��
	private String pBoardCasting;   //��ۻ�
	private String airingPeriod;	//�濵�Ⱓ
	private String pAirDate;		//ȸ�����濵��
	private String pDirector;		//����
	private String pWriter;			//�۰�
	private String pActor;			//�⿬��
	private String genre;			//�帣
	private String nation;			//����
	private String ageRating;		//���
	private String description;		//�ٰŸ�
	private String thumnail_path;	//�����
	
	
}
