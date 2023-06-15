package com.exam.basic.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class BoardDto {

	private int	num;
	private int	korean;
	private int	histore;
	private String examCode;
	private String userName;
	private String phone;
	private Timestamp regTM; 
	private Double avga;
	
}
