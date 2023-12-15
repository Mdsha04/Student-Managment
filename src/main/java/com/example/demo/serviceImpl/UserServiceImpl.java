package com.example.demo.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;

//import com.example.demo.config.CustomUserDetail;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;


public class UserServiceImpl implements UserService{
	
@Autowired UserRepository userrepository;




}

	

//@Override
//public User getNameByUsername(String dasId, String password) {
//	return userrepository.getNameByUsername(dasId);




//@Override
//public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//	User user = userrepository.getUserByUserName(username);
//	
//if(user==null) {
//	throw new UsernameNotFoundException("Could not found user !!");
//}
//
//CustomUserDetail customuserdetails=new CustomUserDetail(user);
//
//	return customuserdetails;
//}
