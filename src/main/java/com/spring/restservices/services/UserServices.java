package com.spring.restservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restservices.entities.User;
import com.spring.restservices.repositories.UserRepository;

@Service
public class UserServices {
	@Autowired
	private UserRepository userRepository;
	public List<User> getAllUsers(){
	return userRepository.findAll();
	
	}
}
