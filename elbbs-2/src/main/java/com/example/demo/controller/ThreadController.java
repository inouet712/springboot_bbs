package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.mapper.ThreadMapper;
import com.example.demo.service.ThreadService;

@Controller
@RequestMapping("/thread")
public class ThreadController {
	
	@Autowired
	private ThreadService service;
	@Autowired
	private ThreadMapper mapper;
	//投稿画面表示
	@GetMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("thread",mapper.selectAll());
		
		
		return "thread";
	}
	
	//データ追加
	//@PostMapping("/add")
	//public String insert(@ModelAttribute Thread thread) {
	//	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	//	thread.setPost_day(timestamp);
	//	service.insert(thread);
	//	return "redirect:/thread/home";
	//}

}
