package com.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.domain.Stop;
import com.microservices.service.StopService;

@RestController
@RequestMapping(value="/v1",produces=MediaType.APPLICATION_JSON_VALUE)
public class StopController {

	@Autowired
	private StopService stopService;
	
	@GetMapping("/stop/{id}")
	public Stop findStopById(@PathVariable int id) {
		return stopService.findStopById(id);
	}
	
	@PostMapping("/stop")
	public Stop addStop(@RequestBody Stop stop) {
		return stopService.addStop(stop);
	}
	
	@PutMapping("/stop")
	public Stop updateStop(@RequestBody Stop stop) {
		return stopService.updateStop(stop);
	}
	
	@DeleteMapping(value="/stop/{id}")
	public void deleteStop(@PathVariable int id) {
		stopService.deleteStop(id);
	}
}
