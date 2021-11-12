package com.example.demo.entity;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Thread {

	private int thread_id;
	
	private String name;
	
	private String content;
	
	private Timestamp post_day;
}
