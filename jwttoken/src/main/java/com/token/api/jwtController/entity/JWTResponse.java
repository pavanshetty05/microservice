package com.token.api.jwtController.entity;

import java.io.Serializable;

public class JWTResponse implements Serializable{
	
	private String token ;
	
	public JWTResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	

}
