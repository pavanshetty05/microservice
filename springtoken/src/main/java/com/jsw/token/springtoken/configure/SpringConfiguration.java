package com.jsw.token.springtoken.configure;

import java.security.SecureRandom;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.jsw.token.springtoken.servicers.MyUserDetailsService;

@Configuration

public class SpringConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	@Autowired
	MyUserDetailsService ouserDetails;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		 auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles
		  ("admin").and().withUser("user") .password("{noop}user").roles("user");
		 

		
		/* auth.jdbcAuthentication().passwordEncoder(new BCryptPasswordEncoder())
		  .dataSource(dataSource)
		  .usersByUsernameQuery("select username, password, enabled from users where username=?"
		  )
		  .authoritiesByUsernameQuery("select username, role from users where username=?"
		  ) ;*/
		 

		//auth.userDetailsService(ouserDetails).passwordEncoder(passwordEncoder());

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/admin").hasAnyRole("admin")
		.antMatchers("/user").hasAnyRole("user")
		.antMatchers("/token/*").permitAll()
		.anyRequest().authenticated().and()
		.formLogin().permitAll().and()
		.logout().logoutSuccessUrl("/logout").permitAll()
		.and().csrf().disable();
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	 BCryptPasswordEncoder bCryptPasswordEncoder =
	  new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}

}
