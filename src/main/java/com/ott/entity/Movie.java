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
	private String mNameko;			//��ȭ�̸�
	private String prdtYear;		//������
	private String openDt;			//������
	private String genreAlt;		//�帣
	private String directors;		//����
	private String companys;		//��ȭ��
	private String thumnail_path;	//�����
}
