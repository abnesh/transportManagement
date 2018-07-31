package com.microservices.vehicleservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicle_capacity",schema="testdb")
public class VehicleCapacity {
	
	@Id
	@GeneratedValue(generator="vehiclecapid_generator")
	private int id;
	private String vehicleType;
	private Integer capacity;
	
	public VehicleCapacity(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	

}
