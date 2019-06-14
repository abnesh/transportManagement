package com.microservices.domain.common;

import java.time.LocalTime;

public class Vehicle {

	private int id;
	private String vehicleNumber;
	private String vehicleType;
	private String manufacturer;
	private LocalTime pickupTime;
	private LocalTime dropTime;
	private int vacancy;
	private int driverid;

	public Vehicle() {
	}

	public int getId() {
		return id;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
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

	public LocalTime getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(LocalTime pickupTime) {
		this.pickupTime = pickupTime;
	}

	public LocalTime getDropTime() {
		return dropTime;
	}

	public void setDropTime(LocalTime dropTime) {
		this.dropTime = dropTime;
	}

	public int getVacancy() {
		return vacancy;
	}

	public void setVacancy(int vacancy) {
		this.vacancy = vacancy;
	}

	public int getDriverid() {
		return driverid;
	}

	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}

}
