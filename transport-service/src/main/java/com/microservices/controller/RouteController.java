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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/v1",produces=MediaType.APPLICATION_JSON_VALUE)
@Api(value="Routes", description="Operations performed on routes", consumes= "application/json" )
public class RouteController {

	@Autowired
	private RouteService routeService;
	
	@ApiOperation(value = "Add a new route",
		    notes = "Route should be provided as a json object",
		    response = Route.class,
		    responseContainer = "List")
	@PostMapping(value="/route")
	public Route addRoute(@RequestBody Route route) {
		return routeService.addRoute(route);
	}
	
	@ApiOperation(value = "Updates a new route",
		    notes = "Route should be provided as a json object",
		    response = Route.class,
		    responseContainer = "List")
	@PutMapping(value="/route")
	public Route updateRoute(@RequestBody Route route) {
		return routeService.updateRoute(route);
	}
	
	@ApiOperation(value = "Delets an existing route",
		    notes = "Route should be provided as a json object",
		    responseContainer = "List")
	@DeleteMapping(value="/route/{id}")
	public void deleteRoute(@PathVariable int id) {
		routeService.deleteRoute(id);
	}
}
