package com.SpringMongoProject.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;


@Configuration
@EnableWebSecurity
public class SécurityConfig extends WebSecurityConfigurerAdapter{
   
	@Autowired 
    public void configure(AuthenticationManagerBuilder auth) throws Exception { 
		 
		UserDetails user = User.withDefaultPasswordEncoder().username("admin").password("123").roles("ADMIN").build();
		auth.inMemoryAuthentication().withUser(user);
		user = User.withDefaultPasswordEncoder().username("manager").password("123").roles("MANAGER").build();
		auth.inMemoryAuthentication().withUser(user);
 
   
		
		
     }
	
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/homepage**").hasRole("ADMIN")
        .antMatchers("/index**").permitAll()
        .antMatchers("/login**").permitAll()
        .and()
        .formLogin();
        //.loginPage( "/login" )
        //.loginProcessingUrl( "/login" )
        //.defaultSuccessUrl( "/index" );
        http.csrf().disable();
 
    }
}

