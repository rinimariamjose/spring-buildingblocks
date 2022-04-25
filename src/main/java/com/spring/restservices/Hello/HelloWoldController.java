package com.spring.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//controller
@RestController
public class HelloWoldController {
//simple method
//URI -/helloworld
//GET
	//@RequestMapping(method = RequestMethod.GET,path = "/helloworld")
	@GetMapping("/helloworld1")
	public String helloWorld(){
		return "Hello World";
	}
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean(){
		return new UserDetails("rini","mariam","Kollam");
	}
}
