package com.microservices.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="driver", schema="testdb")
public class Driver {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String pan;
	private String aadhaar;
	private long contact;
	private String vehicleid;
	
	public Driver() {}
	
	public Driver(int id, String name, String pan, String aadhaar, long contact, String vehicleId) {
		this.id = id;
		this.name = name;
		this.pan = pan;
		this.aadhaar = aadhaar;
		this.contact = contact;
		this.vehicleid = vehicleId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getVehicleId() {
		return vehicleid;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleid = vehicleId;
	}
	public int getId() {
		return id;
	}
	
	

}
