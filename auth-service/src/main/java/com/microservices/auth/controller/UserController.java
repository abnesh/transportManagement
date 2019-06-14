package com.microservices.auth.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.auth.model.User;
import com.microservices.auth.service.UserService;

@RestController
@CrossOrigin
public class UserController {

	@Autowired private UserService userService;
	
	@RequestMapping(value="/users",method=RequestMethod.GET)
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> users = userService.findAll();
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	
	@RequestMapping(value="/getuser",method=RequestMethod.GET)
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<User> getUser(Principal principal){
		User user = userService.getUserByEmail(principal.getName());
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
}
