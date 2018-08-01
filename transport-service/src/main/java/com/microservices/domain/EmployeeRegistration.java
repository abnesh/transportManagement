package com.microservices.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_registration", schema="transportdb")
public class EmployeeRegistration {

	@Id
	@GeneratedValue(generator="emp_reg_generator")
	private int id;
	private int employeeid;
	private String vehicleid;
	private char status;
	
	public EmployeeRegistration() {}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(String vehicleid) {
		this.vehicleid = vehicleid;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}
	
	
	
	
	
	
}
