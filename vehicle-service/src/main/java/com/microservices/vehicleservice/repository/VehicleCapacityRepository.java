package com.microservices.vehicleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.vehicleservice.model.VehicleCapacity;

public interface VehicleCapacityRepository extends JpaRepository<VehicleCapacity, Integer>{

}
