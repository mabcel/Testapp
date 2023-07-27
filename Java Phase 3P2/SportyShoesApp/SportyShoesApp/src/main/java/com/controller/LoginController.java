package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

import com.bean.Category;
import com.bean.Login;
import com.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String open(Model mm, Login ll) {
		mm.addAttribute("login", ll);
		return "index";
	}
	
	@RequestMapping(value = "/openSignUp",method = RequestMethod.GET)
	public String openSignUpPage(Model mm, Login ll) {
		mm.addAttribute("login", ll);
		return "signUp";
	}
	
	@RequestMapping(value = "/signIn",method = RequestMethod.POST)
	public String signIn(Model mm, Login ll,HttpSession hs) {
		String result = loginService.signIn(ll);
		
		if(result.equals("Customer login successfully")) {
			hs.setAttribute("emailid", ll.getEmailid());		// stored session object of that person 
			return "customerHome";
		}else if(result.equals("Admin login successfully")) {
			return "adminHome";
		}else {
			return "index";
		}
		
		//System.out.println(result);
		//mm.addAttribute("login", ll);
		//return "index";
	}
	
	
	@RequestMapping(value = "/signUp",method = RequestMethod.POST)
	public String signUp(Model mm, Login ll) {
		String result = loginService.signUp(ll);
		mm.addAttribute("login", ll);
		System.out.println(result);

		return "index";

	}
	
	
	//Change password
	
	@RequestMapping(value = "/openChangePassword",method = RequestMethod.GET)
	public String openChangePassword(Model mm, Login ll) {
		mm.addAttribute("login", ll);
		return "changePassword";
	}
	
	@RequestMapping(value = "/changePassword",method = RequestMethod.POST)
	public String changePassword(Model mm, Login ll) {
		String result = loginService.changePassword(ll);
		mm.addAttribute("login", ll);
		System.out.println(result);

		return "index";

	}
	
	
//	@RequestMapping(value = "/viewUsersPage",method = RequestMethod.GET)
//	public String viewUsers(Model mm, Login ll) {
//		List<Login> listOfUsers = loginService.findAllUsers();
//		mm.addAttribute("login", listOfUsers);
//		return "viewUsers";
//		
//	}
	
	
	// @RequestMapping(path = {"/","/search"})
	@RequestMapping(value = "/viewUsersPage",method = RequestMethod.GET)
	 public String viewUsers(Login ll, Model mm, String keyword) {
	  if(keyword!=null) {
	   List<Login> userlist = loginService.getByKeyword(keyword);
	   mm.addAttribute("login", userlist);
	  }
	  else {
	  List<Login> userlist = loginService.findAllUsers();
	  mm.addAttribute("login", userlist);
	  }
	  return "viewUsers";
	 }
	 
	 
	
	

  
	
	
	
	
	
}
	