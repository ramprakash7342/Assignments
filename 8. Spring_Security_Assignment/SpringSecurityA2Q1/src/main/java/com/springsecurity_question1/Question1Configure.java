package com.springsecurity_question1;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class Question1Configure extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication()
		                   .withUser("ram")
		                   .password("ram1234")
		                   .roles("USER")
		                   .and()
		                   .withUser("monu")
		                   .password("monu1234")
		                   .roles("ADMIN")
		                   ;
	}
	
	
	@Override
	public void configure(HttpSecurity http) throws Exception{
		
		http.authorizeRequests()
		                .antMatchers("/admin").hasRole("ADMIN")
		                .antMatchers("/user").hasAnyRole("USER","ADMIN")
		                .antMatchers("/").permitAll()
		                .and().formLogin();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
