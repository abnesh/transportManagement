package com.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.domain.EmployeeRegistration;
import com.microservices.domain.Route;
import com.microservices.domain.RouteMap;
import com.microservices.domain.Stop;
import com.microservices.domain.common.RouteMapResult;
import com.microservices.service.TransportService;

@RestController
@RequestMapping(value= "/v1/transport", produces=MediaType.APPLICATION_JSON_VALUE)
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
	public List<RouteMapResult> searchRoutesMaps(@RequestParam int startPoint,@RequestParam int endPoint){
		return transportService.searchRouteMaps(startPoint,endPoint);
		
	}
	
	@PostMapping("/register")
	public ResponseEntity<EmployeeRegistration> registerEmployeeForTransport(@RequestBody EmployeeRegistration empRegistration) {
		EmployeeRegistration er = transportService.registerEmployeeTranportation(empRegistration);
		return new ResponseEntity<EmployeeRegistration>(er,HttpStatus.CREATED);
	}
	
	
	
	
}
