package com.microservices.vehicleservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.vehicleservice.model.Vehicle;
import com.microservices.vehicleservice.model.VehicleCapacity;
import com.microservices.vehicleservice.repository.VehicleCapacityRepository;

@Service
public class VehicleCapacityService {
	
	@Autowired
	VehicleCapacityRepository vehicleCapacityRepositoy;
	
	public VehicleCapacity getById(Integer id){
		
		if(vehicleCapacityRepositoy.findById(id).isPresent())
			return vehicleCapacityRepositoy.findById(id).get();
		else
			return null;
	}
	
	public List<VehicleCapacity> getAllVehicle(){
		return vehicleCapacityRepositoy.findAll();
	}
	
	public VehicleCapacity updateVehicleCapacity(VehicleCapacity vehicle){
		if(vehicleCapacityRepositoy.findById(vehicle.getId()).isPresent())
			return vehicleCapacityRepositoy.save(vehicle);
		else
			return null;
	}
	
	public void deleteVehicleCapacity(VehicleCapacity vehicle){
		if(vehicleCapacityRepositoy.findById(vehicle.getId()).isPresent())
			vehicleCapacityRepositoy.delete(vehicle);
	}
	
	public VehicleCapacity addVehicleCapacity(VehicleCapacity vehicle){
		if(vehicleCapacityRepositoy.findById(vehicle.getId()).isPresent())
			return vehicleCapacityRepositoy.findById(vehicle.getId()).get();
		else
			return vehicleCapacityRepositoy.save(vehicle);
	}
}
