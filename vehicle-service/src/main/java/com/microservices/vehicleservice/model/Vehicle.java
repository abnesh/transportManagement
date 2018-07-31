package com.microservices.vehicleservice.model;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="vehicle",schema="testdb")
public class Vehicle {
	@Id
	@GeneratedValue(generator="vehicleid_generator")
	private int id;
	private String vehicleType;
	private String manufacturer;
	private Time pickupTime;
	private Time dropTime;
	private int vaccent;
	
	
	public Vehicle(){
		
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


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public Time getPickupTime() {
		return pickupTime;
	}


	public void setPickupTime(Time pickupTime) {
		this.pickupTime = pickupTime;
	}


	public Time getDropTime() {
		return dropTime;
	}


	public void setDropTime(Time dropTime) {
		this.dropTime = dropTime;
	}


	public int getVaccent() {
		return vaccent;
	}


	public void setVaccent(int vaccent) {
		this.vaccent = vaccent;
	}

}
