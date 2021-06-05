package com.token.api.jwttoken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.token.api.jwtController.entity.JWTAuthnaticationRequest;
import com.token.api.jwtController.entity.JWTResponse;
import com.token.api.jwttoken.service.MyUserDetailsService;
import com.token.api.jwttoken.utility.JwttokenUtiulity;

@RestController
public class JSWTController {

	@Autowired
	AuthenticationManager automanager;

	@Autowired
	MyUserDetailsService userDetails;

	@Autowired
	JwttokenUtiulity tokenGenerator;

	@RequestMapping(value = "/generatetoken", method = RequestMethod.POST,consumes = "application/json")
	public @ResponseBody JWTResponse generateToken(@RequestBody JWTAuthnaticationRequest autReq) throws Exception {

		try {
			automanager
					.authenticate(new UsernamePasswordAuthenticationToken(autReq.getUserName(), autReq.getPassword()));
		} catch (BadCredentialsException crede) {
			throw new Exception("Bad Credentails", crede);
		}
		UserDetails oUserDetails = userDetails.loadUserByUsername(autReq.getUserName());

		final String genToken = tokenGenerator.generateToken(oUserDetails);
		return new JWTResponse(genToken);
	}

	@RequestMapping(value = "/validatetoken", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody boolean validateToken(@RequestBody JWTAuthnaticationRequest autReq) throws Exception {
		boolean tokenAut = false;

		try {
			automanager
					.authenticate(new UsernamePasswordAuthenticationToken(autReq.getUserName(), autReq.getPassword()));
		} catch (BadCredentialsException crede) {
			throw new Exception("Bad Credentails", crede);
		}

		UserDetails oUserDetails = userDetails.loadUserByUsername(autReq.getUserName());

		tokenAut=tokenGenerator.validateToken("", oUserDetails);
		return tokenAut;
	}

}
