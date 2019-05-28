package com.microservices.vehicleservice.controller;

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

import com.microservices.vehicleservice.model.Vehicle;
import com.microservices.vehicleservice.service.VehicleService;

@RestController
@RequestMapping("/")
public class VehicleServiceController {

	@Autowired
	public VehicleService vehicleService;

	@GetMapping
	public List<Vehicle> getAllVehicle() {
		return vehicleService.getAllVehicle();
	}

	@GetMapping("/{id}")
	public Vehicle getVehicleById(@PathVariable int id) {
		return vehicleService.getById(id);
	}
	
	@GetMapping("/number/{number}")
	public Vehicle getVehicleByNumber(@PathVariable String number) {
		return vehicleService.getByNumber(number);
	}

	@PostMapping
	public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
		return vehicleService.addVehicle(vehicle);
	}

	@PutMapping
	public Vehicle updateVehicle(Vehicle vehicle) {
		return vehicleService.updateVehicle(vehicle);
	}

	@DeleteMapping
	public void deleteVehicle(Vehicle vehicle) {
		vehicleService.deleteVehicle(vehicle);
	}
}
