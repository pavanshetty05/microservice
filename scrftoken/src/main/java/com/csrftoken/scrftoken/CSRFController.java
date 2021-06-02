package com.csrftoken.scrftoken;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CSRFController {

	
	@RequestMapping(value="/usercheckOnes")
	public String getUSerpage()
	{
		return "hello.html";
	}
	
	@RequestMapping(value="/useData",method=RequestMethod.POST)
	public String getUSerData(String fname)
	{
		System.out.println(fname +" --->>>>>>This is the output");
		return "hello.html";
	}
}
