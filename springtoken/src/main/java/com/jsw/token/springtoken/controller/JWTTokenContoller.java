package com.jsw.token.springtoken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JWTTokenContoller {

	@RequestMapping(method = RequestMethod.GET, value="/token/gettoken")
	public String getJSWTToken() {
		
		return " token";
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value="/token/validatetoekn")
	public String validateToekn() {
		
		return " token";
	}
}
