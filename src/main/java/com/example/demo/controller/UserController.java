package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpSession;
//import com.example.demo.service.UserService;
@RequestMapping("/user")
@Controller
public class UserController {
	
	@Autowired (required=false)
	private UserService userservice;
	
@RequestMapping("/index")
public String dashboard() {
	return "base";
}


@RequestMapping("/home")
public String home() {
	return "home";
}

@RequestMapping("/about")
public String about() {

	return "about";
}

//@RequestMapping("/login")
//public String login(Model model,@RequestParam String dasId,
//        @RequestParam String password,HttpSession session){
//try {
//	User user = userservice.getNameByUsername(dasId,password);
//	   session.setAttribute("user",user);
//	return "redirect:students/new";
//}catch(Exception e) {
//	model.addAttribute("error_message","invalid dasid or password");
//
//	return "login";
//}
//	
//}
//
//
//@GetMapping("/logout")
//
//public String logout(HttpSession httpSession)
//
//{
//
//    httpSession.invalidate();
//
//    return "index";
//
//}
@RequestMapping("/login")
public String login() {
	return "login";
}

}
