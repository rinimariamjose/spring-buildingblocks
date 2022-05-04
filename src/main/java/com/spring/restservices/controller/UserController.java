package com.spring.restservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restservices.entities.User;
import com.spring.restservices.services.UserServices;

@RestController
public class UserController {
	@Autowired
	private UserServices userServices;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userServices.getAllUsers();
	}

}
