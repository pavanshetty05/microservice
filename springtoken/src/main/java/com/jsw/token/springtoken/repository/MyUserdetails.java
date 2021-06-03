package com.jsw.token.springtoken.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.jsw.token.springtoken.entity.User;

public class MyUserdetails implements UserDetails {

	User oUser = new User();

	public MyUserdetails(User oUser) {
		this.oUser = oUser;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {

		List<SimpleGrantedAuthority> olist = new ArrayList<SimpleGrantedAuthority>();
		olist.add(new SimpleGrantedAuthority(oUser.getRoles()));

		return olist;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return oUser.getPassword();
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return oUser.getUsername();
	}

	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
