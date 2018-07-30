package com.microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.domain.RouteMap;
import com.microservices.repository.RouteMapRepository;

@Service
public class RouteMapService {

	@Autowired
	private RouteMapRepository routeMapRepository;
	
	public RouteMap addRouteMap(RouteMap routeMap) {
		if(routeMapRepository.findById(routeMap.getId()).isPresent())
			return routeMapRepository.findById(routeMap.getId()).get();
		else
			return routeMapRepository.save(routeMap); 
	}

	public RouteMap updateRouteMap(RouteMap routeMap) {
		if(routeMapRepository.findById(routeMap.getId()).isPresent())
			return routeMapRepository.save(routeMap);
		else
			return null;
	}
	
	public void deleteRouteMap(int id) {
		if(routeMapRepository.findById(id).isPresent())
			routeMapRepository.deleteById(id);
	}
	
	

	
}
