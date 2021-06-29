package com.config.client.configclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.client.configclient.entity.Student;
import com.config.client.configclient.repo.studentRepo;

@RestController
@RefreshScope
public class GetpropertyFile {

	@Value("${value}")
	public String value=null;
	
	@Autowired
	studentRepo ostudent;

	@RequestMapping(value = "/getproperty")
	public List<Student> getUserDetails() {
		List<Student> ostudentlist= (List<Student>) ostudent.findAll();
		System.out.println("value >>>>>>>>>>" +  value);
		return ostudentlist;
	}
}
