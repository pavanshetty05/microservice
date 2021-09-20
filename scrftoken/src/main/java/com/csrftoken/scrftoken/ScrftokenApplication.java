package com.csrftoken.scrftoken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScrftokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScrftokenApplication.class, args);
	}
	
	public int checkStatus()
	{
		int k=0;
		if(k==0)
		{
			return k=4;
		}else{
			return k=6;
		}
	}

}
