package com.microservices.vehicleservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.vehicleservice.model.Vehicle;
import com.microservices.vehicleservice.repository.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
	VehicleRepository vehicleRepositoy;
	
	public Vehicle getById(Integer id){
		
		if(vehicleRepositoy.findById(id).isPresent())
			return vehicleRepositoy.findById(id).get();
		else
			return null;
	}
	
	public List<Vehicle> getAllVehicle(){
		return vehicleRepositoy.findAll();
	}
	
	public Vehicle updateVehicle(Vehicle vehicle){
		if(vehicleRepositoy.findById(vehicle.getId()).isPresent())
			return vehicleRepositoy.save(vehicle);
		else
			return null;
	}
	
	public void deleteVehicle(Vehicle vehicle){
		if(vehicleRepositoy.findById(vehicle.getId()).isPresent())
			vehicleRepositoy.delete(vehicle);
	}
	
	public Vehicle addVehicle(Vehicle vehicle){
		if(vehicleRepositoy.findById(vehicle.getId()).isPresent())
			return vehicleRepositoy.findById(vehicle.getId()).get();
		else
			return vehicleRepositoy.save(vehicle);
	}
}
