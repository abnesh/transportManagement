package com.microservices.employeeservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee",schema="employeedb")
public class Employee {

	@Id
	@GeneratedValue(generator="emp_generator")
	private int id;
	private String name;
	private String email;
	private String enterpriseid;
	private Character gender;
	private long contact;
	//private Address address;
	
	
	
	public Employee(int id, String name, String email, String enterpriseid,
			Character gender, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.enterpriseid = enterpriseid;
		this.gender = gender;
		this.contact = contact;
	}
	public Employee() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEnterpriseid() {
		return enterpriseid;
	}
	public void setEnterpriseid(String enterpriseid) {
		this.enterpriseid = enterpriseid;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	/*public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}*/
	public int getId() {
		return id;
	}
	
	
	
}
