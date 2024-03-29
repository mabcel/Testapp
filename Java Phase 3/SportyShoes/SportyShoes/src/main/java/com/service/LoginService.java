package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	
	public String signUp(Login login) {
		if(login.getTypeofuser().equalsIgnoreCase("admin")) {
			return "Admin account can't create";
		}else {
			Optional<Login> result = loginRepository.findById(login.getEmailid());
			if(result.isPresent()) {
				return "Already account present";
			}else {
				loginRepository.save(login);
				return "Account created successfully";
			}
		}
	}
	
	
	public String signIn(Login login) {
		Login ll = loginRepository.signIn(login.getEmailid(), login.getPassword(), login.getTypeofuser());
		if(ll==null) {
			return "Invalid emailid or password";
		}else {
			if(ll.getTypeofuser().equalsIgnoreCase("admin")) {
				return "Admin login successfully";
			}else {
				return "Customer login successfully";
			}
		}
		
	}
	
	public String changePassword(Login login) {
		Optional<Login> result = loginRepository.findById(login.getEmailid());
		if(result.isPresent()) {
			Login ll = result.get();
				ll.setPassword(login.getPassword());
				loginRepository.saveAndFlush(ll);
				return "Password changed successfully";
		}else {
			return "User not present";
		}
	}
	
	public Login findUserById(String emailid) {
		Optional<Login> result = loginRepository.findById(emailid);
		if(result.isPresent()) {
			Login ll = result.get();
			return ll;
		}else {
			return null;
		}
	}
	
	
}
