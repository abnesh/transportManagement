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

import com.microservices.domain.RouteMap;
import com.microservices.service.RouteMapService;

@RestController
@RequestMapping(value="/routemap",produces=MediaType.APPLICATION_JSON_VALUE)
public class RouteMapController {

	@Autowired
	private RouteMapService routeMapService;
	
	@PostMapping
	public RouteMap addRouteMap(@RequestBody RouteMap routeMap) {
		return routeMapService.addRouteMap(routeMap);
	}
	
	@PutMapping
	public RouteMap updateRouteMap(@RequestBody RouteMap routeMap) {
		return routeMapService.updateRouteMap(routeMap);
	}
	
	@DeleteMapping(value="/{id}")
	public void deleteRouteMap(@PathVariable int id) {
		routeMapService.deleteRouteMap(id);
	}
	
}
