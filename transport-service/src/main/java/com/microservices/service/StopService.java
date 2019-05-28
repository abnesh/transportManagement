package com.microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.domain.Stop;
import com.microservices.repository.StopRepository;

@Service
public class StopService {

	@Autowired
	private StopRepository stopRepository;

	public Stop addStop(Stop stop) {
		if (stopRepository.findById(stop.getId()).isPresent())
			return stopRepository.findById(stop.getId()).get();
		else
			return stopRepository.save(stop);
	}

	public Stop updateStop(Stop stop) {
		if (stopRepository.findById(stop.getId()).isPresent())
			return stopRepository.save(stop);
		else
			return null;
	}

	public void deleteStop(int id) {
		if(stopRepository.findById(id).isPresent())
			stopRepository.deleteById(id);
	}

	public Stop findStopById(int id) {
		if (stopRepository.findById(id).isPresent())
			return stopRepository.findById(id).get();
		else 
			return null;
	}
	
}
