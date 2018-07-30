package com.microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.domain.Route;
import com.microservices.repository.RouteRepository;

@Service
public class RouteService {

	@Autowired
	private RouteRepository routeRepository;
	
	public Route addRoute(Route route) {
		if(routeRepository.findById(route.getId()).isPresent()) 
			return routeRepository.findById(route.getId()).get();
		else 
			return routeRepository.save(route);
	}

	public Route updateRoute(Route route) {
		if(routeRepository.findById(route.getId()).isPresent()) 
			return routeRepository.save(route);
		else 
			return null;
		
	}

	public void deleteRoute(int id) {
		if(routeRepository.findById(id).isPresent()) 
			routeRepository.deleteById(id);
	}

}
