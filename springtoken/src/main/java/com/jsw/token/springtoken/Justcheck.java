package com.jsw.token.springtoken;

import java.security.SecureRandom;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Justcheck {

	public static void main(String arr[]) {

		int strength = 9; // work factor of bcrypt
		
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		
		System.out.println(bCryptPasswordEncoder.encode("admin"));
		
	}

}
