package com.token.api.jwttoken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.token.api.jwtController.entity.HelloService;

@Controller
public class UserController {
	
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public @ResponseBody HelloService getUserDetails()
	{
		HelloService oservice=new HelloService();
		oservice.setClassName("6 Standard");
		oservice.setLastName("Shetty");
		oservice.setUserName("Jeet");
		return oservice;
	}

}
