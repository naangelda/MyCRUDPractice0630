package com.jp.ht.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistController {
	
	
	@RequestMapping("registpage")
	public String goToRegist() {
			
		return "regist";
	}
}	
