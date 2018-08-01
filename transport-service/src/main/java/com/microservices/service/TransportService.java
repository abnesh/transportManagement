package com.microservices.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.domain.Route;
import com.microservices.domain.RouteMap;
import com.microservices.domain.Stop;
import com.microservices.domain.common.Employee;
import com.microservices.repository.EmployeeRegistrationRepository;
import com.microservices.repository.RouteMapRepository;
import com.microservices.repository.RouteRepository;
import com.microservices.repository.StopRepository;

@Service
public class TransportService {

	@Autowired
	private RouteRepository routeRepository;
	@Autowired
	private StopRepository stopRepository;
	@Autowired
	private RouteMapRepository routeMapRepository;	
	@Autowired
	private EmployeeRegistrationRepository employeeRegistrationRepository;
	@Autowired
	private RestTemplate restTemplate;
	
	public TransportService() {}
	
	public List<Route> findAllRoutes() {
		return routeRepository.findAll();
	}

	public List<Stop> findAllStops() {
		return stopRepository.findAll();
	}
	
	public List<RouteMap> findAllRouteMap(){
		return routeMapRepository.findAll();
	}

	public List<RouteMap> searchRouteMaps(int startPoint, int endPoint) {
		List<RouteMap> startRouteMapList = routeMapRepository.findByStopid(startPoint);
		List<RouteMap> endRouteMapList = routeMapRepository.findByStopid(endPoint);
		
		return startRouteMapList.stream()
						.flatMap(s->endRouteMapList.stream()
												.filter(e-> s.getRouteid()==e.getRouteid() 
														&& s.getVehicleid().equals(e.getVehicleid()))
						).collect(Collectors.toList());
	}
	
	public void registerEmployeeTranportation(int id) {
		String url = "http://employee-service/"+id;
		Employee emp = restTemplate.getForObject(url, Employee.class);
		
		if(emp==null)
			System.out.println("Employee Not Found. Please check your employee id");
		else {
			//TODO Check for vehicle vacancy for multi-threads
			
			//Call to Vehicle service to check for vacancy
			/*if(vehicle.vacancy > 0)
				employeeRegistrationRepository.save(empReg);
				vehicle.update vacancy-- ; 
				//successfully registered
				
*/		}
		
		
		
	}

}
