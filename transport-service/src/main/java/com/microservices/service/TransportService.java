package com.microservices.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.domain.EmployeeRegistration;
import com.microservices.domain.Route;
import com.microservices.domain.RouteMap;
import com.microservices.domain.Stop;
import com.microservices.domain.common.Employee;
import com.microservices.domain.common.RouteMapResult;
import com.microservices.domain.common.Vehicle;
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

	public List<RouteMapResult> searchRouteMaps(int startPoint, int endPoint) {
		List<RouteMap> startRouteMapList = routeMapRepository.findByStopid(startPoint);
		List<RouteMap> endRouteMapList = routeMapRepository.findByStopid(endPoint);
		
		//Fetching a list of routes that has both the pickup and drop points
		List<RouteMap> searchResult = startRouteMapList.stream()
						.flatMap(s->endRouteMapList.stream()
												.filter(e-> s.getRouteid()==e.getRouteid() 
														&& s.getVehicleid().equals(e.getVehicleid()))
						).collect(Collectors.toList());
		
		//List to display data in UI format
		List<RouteMapResult> routeResults = new ArrayList<>();
		
		//Stream through the searchResult and populating corresponding RouteMapResult object
		if(!searchResult.isEmpty()) {
			searchResult.stream()
						.forEach(sr -> {
							RouteMapResult rmr = new RouteMapResult();
							rmr.setRouteid(sr.getRouteid());
							rmr.setStartPoint(stopRepository.getOne(startPoint).getName());
							rmr.setEndPoint(stopRepository.getOne(sr.getStopid()).getName());
							rmr.setLandmark(stopRepository.getOne(sr.getStopid()).getLandmark());
							rmr.setDropTime(sr.getDeparture());
							Vehicle veh = this.getVehicle(sr.getVehicleid()); 
							if(veh != null) {
								rmr.setVacancy(veh.getVacancy());
								rmr.setVehicleid(veh.getVehicleNumber());
								rmr.setPickUpTime(veh.getPickupTime());
								rmr.setBookable((rmr.getVacancy()>0)?true:false);
							}
							//Setting Booking status as per available vacancy
							routeResults.add(rmr);
						});
		}
		
		return routeResults;
		
	}
	
	private Vehicle getVehicle(String id) {
		String url = "http://vehicle-service/number/"+id;
		Vehicle vehicle = restTemplate.getForObject(url, Vehicle.class);
		return vehicle;
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

	/**
	 * @return 
	 * @Description When user selects a route and tries to book for a valid Vehicle, this method checks whether user already
	 * has any active booking available. If Yes, an error message is sent to user with status as 412 Precondition Failed, else
	 * a new entry is created in database table. 
	 * 
	 * @Param Entity of type EmployeeRegistration
	 * 
	 * */
	public EmployeeRegistration registerEmployeeTranportation(EmployeeRegistration empRegistration) {
		EmployeeRegistration empReg = employeeRegistrationRepository.findByEmployeeid(empRegistration.getEmployeeid());
		if(empReg == null) {
			return employeeRegistrationRepository.save(empRegistration);
		}else if(empReg.getStatus() == 'N'){
			return employeeRegistrationRepository.save(empRegistration);
		}else {
			return empReg;
		}
		
		
	}

}
