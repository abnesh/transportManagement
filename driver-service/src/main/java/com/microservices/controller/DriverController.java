package com.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.model.Driver;
import com.microservices.service.DriverService;

@RestController
@RequestMapping("/")
public class DriverController {

	@Autowired
	private DriverService driverService;
	
	@GetMapping
	public List<Driver> getDrivers() {
		return driverService.findAllDrivers();
	}
	
	@GetMapping("/{id}")
	public Driver findDriverById(@PathVariable int id) {
		return driverService.findById(id);
	}
	
	@PostMapping()
	public Driver addDriver(@RequestBody Driver driver) {
		return driverService.addDriver(driver);
	}
	
	@PutMapping()
	public Driver updateDriver(@RequestBody Driver driver) {
		return driverService.updateDriver(driver);
	}
	
	@DeleteMapping(value="/{id}")
	public void deleteDriver(@PathVariable int id) {
		driverService.deleteDriver(id);
	}
	
}
