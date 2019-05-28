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

import com.microservices.vehicleservice.model.VehicleCapacity;
import com.microservices.vehicleservice.service.VehicleCapacityService;

@RestController
@RequestMapping("/vc")
public class VehicleCapacityController {

	@Autowired
	public VehicleCapacityService vehicleService;

	@GetMapping
	public List<VehicleCapacity> getAllVehicleCapacity() {
		return vehicleService.getAllVehicle();
	}

	@GetMapping("/{id}")
	public VehicleCapacity getVehicleCapacityById(@PathVariable int id) {
		return vehicleService.getById(id);
	}

	@PostMapping
	public VehicleCapacity addVehicle(@RequestBody VehicleCapacity vehicle) {
		return vehicleService.addVehicleCapacity(vehicle);
	}

	@PutMapping
	public VehicleCapacity updateVehicleCapacity(VehicleCapacity vehicle) {
		return vehicleService.updateVehicleCapacity(vehicle);
	}

	@DeleteMapping
	public void deleteVehicleCapacity(VehicleCapacity vehicle) {
		vehicleService.deleteVehicleCapacity(vehicle);
	}
}
