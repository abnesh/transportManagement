package com.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.domain.Route;
import com.microservices.service.RouteService;

@RestController
@RequestMapping(value="/route",produces=MediaType.APPLICATION_JSON_VALUE)
public class RouteController {

	@Autowired
	private RouteService routeService;
	
	@PostMapping
	public Route addRoute(@RequestBody Route route) {
		return routeService.addRoute(route);
	}
	
	@PutMapping
	public Route updateRoute(@RequestBody Route route) {
		return routeService.updateRoute(route);
	}
	
	@DeleteMapping(value="/{id}")
	public void deleteRoute(@PathVariable int id) {
		routeService.deleteRoute(id);
	}
}
