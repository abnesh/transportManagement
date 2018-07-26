package com.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.model.Driver;
import com.microservices.service.DriverService;

@RestController
@RequestMapping("/driver")
public class DriverController {

	@Autowired
	private DriverService driverService;
	
	@GetMapping
	public List<Driver> getDrivers() {
		return driverService.findAllDrivers();
	}
	
	@GetMapping("/{id}")
	public Driver getDriverById(@PathVariable int id) {
		return driverService.findDriverById(id);
	}
	
	@PostMapping()
	public Driver addDriver(@RequestBody Driver driver) {
		return driverService.addDriver(driver);
	}
	
}
