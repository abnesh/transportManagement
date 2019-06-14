package com.microservices.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.auth.domain.Response;
import com.microservices.auth.model.User;
import com.microservices.auth.service.UserService;

@RestController
@CrossOrigin
public class PreLoginController {

	@Autowired private UserService userService;
	
	@RequestMapping(value="/registration",method=RequestMethod.POST)
	public ResponseEntity<Response> registration(@RequestBody User user){
		User dbUser = userService.save(user);
		if(dbUser != null) {
			return new ResponseEntity<Response>(new Response("User is saved successfully"), HttpStatus.OK);
		}
		return null;
	}
}
