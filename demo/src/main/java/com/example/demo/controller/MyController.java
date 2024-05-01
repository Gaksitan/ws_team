package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/my")
public class MyController {
	
	@RequestMapping("/main")
	public void root() {
		log.info("root......"); //메서드 실행됬는지 콘솔창에서 확인용
	}
	
	
	
	
}
