package com.microservices.auth.domain;

import java.io.Serializable;

import com.microservices.auth.model.User;

public class UserDto implements Serializable{
	
	private User user;
	private String token;
	
	public UserDto(User user, String token) {
		super();
		this.user = user;
		this.token = token;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
