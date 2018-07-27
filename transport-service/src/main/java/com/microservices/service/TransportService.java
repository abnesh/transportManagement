package com.microservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.domain.Route;
import com.microservices.domain.RouteMap;
import com.microservices.domain.Stop;
import com.microservices.repository.RouteMapRepository;
import com.microservices.repository.RouteRepository;
import com.microservices.repository.StopRepository;

@Service
public class TransportService {

	@Autowired
	private RouteRepository routeRepository;
	@Autowired
	private StopRepository stopRepository;
	@Autowired
	private RouteMapRepository routeMapRepository;
	
	public TransportService() {}
	
	public List<Route> findAllRoutes() {
		return routeRepository.findAll();
	}

	public List<Stop> findAllStops() {
		return stopRepository.findAll();
	}
	
	public List<RouteMap> findAllRouteMap(){
		return routeMapRepository.findAll();
	}

}
