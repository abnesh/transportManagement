package com.microservices.domain;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="route_map",schema="transportdb")
public class RouteMap implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private int routeid;
	private int stopid;
	private String vehicleid;
	private LocalTime arrival;
	private LocalTime departure;
	
	public RouteMap() {}

	public RouteMap(int routeid, int stopid, String vehicleid, LocalTime arrival, LocalTime departure) {
		super();
		this.routeid = routeid;
		this.stopid = stopid;
		this.vehicleid = vehicleid;
		this.arrival = arrival;
		this.departure = departure;
	}
	
	public int getId() {
		return id;
	}

	public int getRouteid() {
		return routeid;
	}

	public void setRouteid(int routeid) {
		this.routeid = routeid;
	}

	public int getStopid() {
		return stopid;
	}

	public void setStopid(int stopid) {
		this.stopid = stopid;
	}

	public String getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(String vehicleid) {
		this.vehicleid = vehicleid;
	}

	public LocalTime getArrival() {
		return arrival;
	}

	public void setArrival(LocalTime arrival) {
		this.arrival = arrival;
	}

	public LocalTime getDeparture() {
		return departure;
	}

	public void setDeparture(LocalTime departure) {
		this.departure = departure;
	}
	
	
	
	
}
