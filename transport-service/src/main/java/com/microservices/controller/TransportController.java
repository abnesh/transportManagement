package com.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.domain.Route;
import com.microservices.domain.RouteMap;
import com.microservices.domain.Stop;
import com.microservices.service.TransportService;

@RestController
@RequestMapping(value= "/transport", produces=MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class TransportController {

	@Autowired
	private TransportService transportService;
	
	@GetMapping("/routes")
	public List<Route> findAllRoutes(){
		return transportService.findAllRoutes();
	}
	
	@GetMapping("/stops")
	public List<Stop> findAllStop(){
		return transportService.findAllStops();
	}
	
	@GetMapping("/routesmaps")
	public List<RouteMap> findAllRouteMap(){
		return transportService.findAllRouteMap();
	}
	
	@GetMapping("/routes/search")
	public List<RouteMap> searchRoutesMaps(@RequestParam int startPoint,@RequestParam int endPoint){
		return transportService.searchRouteMaps(startPoint,endPoint);
		
	}
	
}
