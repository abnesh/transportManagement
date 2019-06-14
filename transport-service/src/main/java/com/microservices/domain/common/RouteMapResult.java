package com.microservices.domain.common;

import java.time.LocalTime;

public class RouteMapResult {
	
	private int routeid;
	private String startPoint;
	private String endPoint;
	private String landmark;
	private LocalTime pickUpTime;
	private LocalTime dropTime;
	private int vacancy;
	private String vehicleid;
	private boolean isBookable;
	
	public RouteMapResult() {}

	public int getRouteid() {
		return routeid;
	}

	public void setRouteid(int routeid) {
		this.routeid = routeid;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public LocalTime getPickUpTime() {
		return pickUpTime;
	}

	public void setPickUpTime(LocalTime pickUpTime) {
		this.pickUpTime = pickUpTime;
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
	
	public String getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(String vehicleid) {
		this.vehicleid = vehicleid;
	}

	public boolean isBookable() {
		return isBookable;
	}

	public void setBookable(boolean isBookable) {
		this.isBookable = isBookable;
	}
	
	
	

}
