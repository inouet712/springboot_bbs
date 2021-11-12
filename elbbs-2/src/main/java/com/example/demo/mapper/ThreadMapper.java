package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Thread;

@Mapper
@Repository
public interface ThreadMapper {
	
	List<Thread> selectAll();
	
	void insert(Thread thread);

}
