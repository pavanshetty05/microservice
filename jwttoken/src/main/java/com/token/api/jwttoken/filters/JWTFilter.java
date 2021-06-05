package com.token.api.jwttoken.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;
import javax.servlet.*;  
import com.token.api.jwttoken.service.MyUserDetailsService;
import com.token.api.jwttoken.utility.JwttokenUtiulity;


@Component
public class JWTFilter extends OncePerRequestFilter{
	
	@Autowired
	MyUserDetailsService userDetails;
	
	@Autowired
	JwttokenUtiulity jwtutil;
	

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filter)
			throws ServletException, IOException {
		
		
		String autToken=request.getHeader("Authorization");
		if(autToken != null && autToken.startsWith("Bearer "))
		{
			
			String token=autToken.substring(7);
			String userName=jwtutil.getUsernameFromToken(token);
			
			if(userName!=null && SecurityContextHolder.getContext().getAuthentication() == null);
			{
				UserDetails ouser= this.userDetails.loadUserByUsername(userName);
				
				if(jwtutil.validateToken(token, ouser))
				{
					UsernamePasswordAuthenticationToken  ouserName= new UsernamePasswordAuthenticationToken(ouser,null,ouser.getAuthorities());
					ouserName.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
					
					SecurityContextHolder.getContext().setAuthentication(ouserName);
				}
			}
			filter.doFilter(request, response);
		}else if(request.getRequestURI().contains("/generatetoken"))
		{  
			// this is a temp Fix
			filter.doFilter(request, response);
		}
		
		
	}

}
