package com.token.api.jwtController.entity;

import java.io.Serializable;

public class JWTAuthnaticationRequest implements Serializable {

	private String userName;

	private String password;
	
	/*private String token;
	
	
	

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}*/

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
