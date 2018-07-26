package com.microservices.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.model.Driver;
import com.microservices.repository.DriverRepository;

@Service
public class DriverService {

	@Autowired
	private DriverRepository driverRepository;
	
	List<Driver> driverList =  new ArrayList<>();
	
	DriverService(){
		Driver d1 = new Driver(101,"Ram","RAMKU6787R","1234-5678-9876-5432",9999912345L,"KA03-MA-6754");
		Driver d2 = new Driver(102,"Shyam","SHYKU1232S","4585-9846-3434-3432",1234567890L,"KA10-FA-0098");
		Driver d3 = new Driver(103,"Ghanshyam","GHNKU6339G","4535-7854-5521-9856",8888999952L,"TN07-TZ-0014");
		Driver d4 = new Driver(104,"Ramu","RAMUK2312R","2365-6975-4578-5422",9988776655L,"KA03-IQ-1412");
		
		driverList.add(d1);
		driverList.add(d2);
		driverList.add(d3);
		driverList.add(d4);
	}
	
	public List<Driver> findAllDrivers() {
		return driverRepository.findAll();		
	}

	public Driver addDriver(Driver driver) {
		return driverRepository.save(driver);
	}

	public Driver findDriverById(int id) {
		return driverRepository.findDriverById(id);
	}

}
