package com.lidunbaoan.ldoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/te")
public class TestController {

	
	
	@RequestMapping("/t")
	@ResponseBody
	public String test() {
		return "123";
	}
}
