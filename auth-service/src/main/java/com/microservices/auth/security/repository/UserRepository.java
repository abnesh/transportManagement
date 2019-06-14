package com.microservices.auth.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservices.auth.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	User findByEmailIgnoreCase(String username);

}
