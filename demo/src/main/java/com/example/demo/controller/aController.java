package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/a")
public class aController {
	
	@RequestMapping("/")
	public @ResponseBody String root() {

		return "Hi~~";
	}
	
	@RequestMapping("/main")
	public String main() {
		log.info("A_main......");
		return "a/main";
	}
	
}
