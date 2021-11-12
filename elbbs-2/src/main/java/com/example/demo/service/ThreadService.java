package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Thread;
import com.example.demo.mapper.ThreadMapper;

@Service
public class ThreadService {

	
	@Autowired
	private ThreadMapper mapper;
	
	public List<Thread> selectAll() {
		return mapper.selectAll();
	}
	
	public void insert(Thread thread) {
		mapper.insert(thread);
	}
}