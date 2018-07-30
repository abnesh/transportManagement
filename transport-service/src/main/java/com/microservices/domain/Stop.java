package com.microservices.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stop", schema="transportdb")
public class Stop {

	@Id
	@GeneratedValue(generator="stopid_generator")
	private int id;
	private String name;
	private String landmark;
	
	public Stop() {}

	public Stop(int id, String name, String landmark) {
		super();
		this.id = id;
		this.name = name;
		this.landmark = landmark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public int getId() {
		return id;
	}
	
	
	
}
