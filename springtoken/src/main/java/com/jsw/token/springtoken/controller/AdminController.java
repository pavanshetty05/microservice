package com.jsw.token.springtoken.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String getwelcomePage() {
		System.out.println("This is the configuration >>>>>>>");
		return "admin.html";
	}
	
	
	
	
}
