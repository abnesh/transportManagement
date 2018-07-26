package com.microservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.model.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Integer>{

	public List<Driver> findAll();
	
	public Driver findDriverById(int id);
	
	public Driver save(Driver driver);
}
