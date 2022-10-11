package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserModel;
import com.example.demo.model.UserRepository;


@Service
public class UserServicePassword {
	
	@Autowired
	private UserRepository userRepository;
	
	
 	PasswordEncoder passwordEncoder;


	public UserServicePassword(UserRepository userRepository) {
		
		this.userRepository = userRepository;
		this.passwordEncoder = new BCryptPasswordEncoder();
	}
	
	public UserModel save(UserModel userModel) {
	String encodedPassword = this.passwordEncoder.encode(userModel.getPassword());
	userModel.setPassword(encodedPassword);
	return this.userRepository.save(userModel);
	}
	
	

}
