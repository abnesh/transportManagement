package com.microservices.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="route",schema="transportdb")
public class Route {

	@Id
	private int id;
	
	private String start;
	
	private String destination;
	
	public Route() {}
	
	public Route(int id, String start, String destination) {
		super();
		this.id = id;
		this.start = start;
		this.destination = destination;
	}
	
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getId() {
		return id;
	}
	
	
	
}
