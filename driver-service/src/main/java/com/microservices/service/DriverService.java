package com.microservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.model.Driver;
import com.microservices.repository.DriverRepository;

@Service
public class DriverService {

	@Autowired
	private DriverRepository driverRepository;
	
	public List<Driver> findAllDrivers() {
		return driverRepository.findAll();		
	}

	public Driver addDriver(Driver driver) {
		if(driverRepository.findById(driver.getId()).isPresent())
			return driverRepository.findById(driver.getId()).get();
		else
			return driverRepository.save(driver);
	}

	public Driver findById(int id) {
		return driverRepository.findDriverById(id);
	}

	public Driver updateDriver(Driver driver) {
		if(driverRepository.findById(driver.getId()).isPresent())
			return driverRepository.save(driver);
		else
			return null;
	}
	
	public void deleteDriver(int id) {
		if(driverRepository.findById(id).isPresent())
			driverRepository.deleteById(id);
	}

}
