package com.microservices.auth.service;

import java.util.List;

import com.microservices.auth.model.User;

public interface UserService {

	User save(User user);

	List<User> findAll();

	User getUserByEmail(String email);

}
