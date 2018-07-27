package com.SpringRestMongoDB.sbsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

@Configuration
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	@Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception { 
		
		UserDetails user = User.withDefaultPasswordEncoder().username("admin").password("123").roles("ADMIN").build();
		auth.inMemoryAuthentication().withUser(user);
		user = User.withDefaultPasswordEncoder().username("manager").password("123").roles("MANAGER").build();
		auth.inMemoryAuthentication().withUser(user);
     }
	
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	
        http.cors().and().authorizeRequests().antMatchers(HttpMethod.GET,"/api/historique").permitAll();
        http.cors().and().authorizeRequests().antMatchers(HttpMethod.GET,"/api/historique/{nom}/{dateD}/{dateF}").permitAll();
        http.cors().and().authorizeRequests().antMatchers(HttpMethod.GET,"/api/historique/{nom}").permitAll();
        http.cors().and().authorizeRequests().antMatchers(HttpMethod.GET,"/api/historique/echec/{dateD}").permitAll();

        
  http.cors().and().authorizeRequests().antMatchers(HttpMethod.PUT,"/api/test/{id}").permitAll();	
  http.cors().and().authorizeRequests().antMatchers(HttpMethod.PUT,"/api/test/**").permitAll();	
  http.authorizeRequests().antMatchers(HttpMethod.GET,"/api/test/{id}").permitAll();

  http.cors().and().authorizeRequests().antMatchers(HttpMethod.DELETE,"/api/test/delete/**").permitAll();	
    http.authorizeRequests().antMatchers(HttpMethod.GET,"/api/Customers/**").permitAll();
    http.authorizeRequests().antMatchers(HttpMethod.GET,"/api/test/**").permitAll();
    http.authorizeRequests().antMatchers(HttpMethod.POST,"/api/customers/create").permitAll();
    http.cors().and().authorizeRequests().antMatchers(HttpMethod.POST,"/api/test/create").permitAll();
    http.cors().and().authorizeRequests().antMatchers(HttpMethod.DELETE,"/api/test/delete/{id}").permitAll();

    	http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll();
    	
    	
  
 
    }
}
