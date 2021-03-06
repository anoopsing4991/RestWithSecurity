package com.secure.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled=true,proxyTargetClass=true)
public class StudentConfig extends WebSecurityConfigurerAdapter{

	 @Override
	  protected void configure(HttpSecurity http) throws Exception
	  { 
	    http.csrf().disable().authorizeRequests().antMatchers("/api/user/**")
	  .hasAnyRole("user","admin").and().formLogin();
	  
	  }
	 
	@Autowired
	protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("sonu").password("root").roles("user","admin");
		
	}

}
