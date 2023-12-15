//package com.example.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import com.example.demo.serviceImpl.UserServiceImpl;
//
//@Configuration
//@EnableWebSecurity
//public class MyConfig extends WebSecurityConfiguration{
//
//	@Bean
//	public UserDetailsService getUserDetailService() {
//		return new UserServiceImpl();
//	}
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//		
//	}
//	@Bean
//	public DaoAuthenticationProvider authenticationProvider() {
//		DaoAuthenticationProvider daoAuthenticationProvider= new DaoAuthenticationProvider();
//		
//		daoAuthenticationProvider.setUserDetailsService(this.getUserDetailService());
//		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
//		
//		return daoAuthenticationProvider;
//	}
//	
//	
//	protected void configure(AuthenticationManagerBuilder auth)throws Exception {
//		auth.authenticationProvider(authenticationProvider());
//	}
//
//	   
//	    protected void configure(HttpSecurity http) throws Exception {
//	        http.authorizeRequests()
//	            .requestMatchers("/students/**").hasRole("dasId")
//	            .anyRequest().authenticated()
//	            .and()
//	            .formLogin()
//	            .loginPage("/login")
//	            .defaultSuccessUrl("/index")
//	            .and()
//	            .logout()
//	            .logoutUrl("/logout")
//	            .logoutSuccessUrl("/login")
//	            .and()
//	            .csrf().disable();
//	    }
//}
