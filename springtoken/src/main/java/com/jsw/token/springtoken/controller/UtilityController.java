package com.jsw.token.springtoken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UtilityController {

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String getlogout() {
		System.out.println("This is the configuration >>>>>>>");
		return "logout";
	}

	@RequestMapping(value = "/invalid", method = RequestMethod.GET)
	public String getunathoraised() {
		System.out.println("This is the configuration >>>>>>>");
		return "unautoriased";
	}
}
